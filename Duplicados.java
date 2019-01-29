import java.util.ArrayList;
import java.util.Arrays;

public class BorrarDuplicados {

    public static void main(String[] args) {
        
        ArrayList<String> arreglo = new ArrayList<String>();
                
        arreglo.addAll(Arrays.asList(
                "low", "disillusioned","decorate", "throat", "wrench",
                "pack", "zip", "offbeat", "daughter", "kind", 
                "confess", "swift", "part", "route", "spiffy", 
                "groovy", "trail", "damaged", "satisfying", "oval", 
                "decorous", "divergent", "hobbies", "disillusioned", "prevent",
                "hypnotic", "supreme", "secretive", "company", "scarf",
                "watch", "coach", "likeable", "rich", "wound", 
                "endurable", "babies", "look", "tough", "jumpy", 
                "grandmother", "lean", "omniscient", "explode", "cheerful", 
                "bomb", "likeable","arrest", "arrest", "arrest")); 
        
        System.out.print("El tamaño inicial del arreglo es "+ arreglo.size());
        /*
            arreglo.addAll(Arrays.asList(
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest", 
                "arrest", "arrest", "arrest", "arrest", "arrest")); 
        */
      
        arreglo.sort(null);
        //System.out.println(arreglo+"\n"); 
        int counter = 0;
      
        for(int i = 0; i < arreglo.size()-1; i++){
            if(arreglo.get(i).equals(arreglo.get(i+1))){
                System.out.println("Palabra duplicada:" + arreglo.get(i+1));
                arreglo.remove(i);
                System.out.println("Palabra borrada. \n" );
                i -= 1;
                counter += 1;
        }
    } 
      
        System.out.println(arreglo+"\n"); 
        System.out.println("Cantidad de palabras duplicadas: " + counter + 
              "\n Nuevo tamaño del arreglo es " + arreglo.size());   
    }
}
