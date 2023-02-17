//import java.util.Arrays;
import java.util.Random;

public class Selection_Sort{
    public static void main(String[] args){
        int[] v = VetRandom(1000000);
            
            long ini = System.currentTimeMillis();
            
            selectionSort(v);       

            long fin = System.currentTimeMillis();

            System.out.println("Tempo: " + (fin - ini) + " ms");

            //System.out.println(Arrays.toString(v));                       //comando para mostrar o vetor já ordenado
    }
  
    public static int[] VetRandom(int aux){
        int [] v = new int[aux];
        Random gerador = new Random();
            for (int i = 0; i < aux; i++){
                v[i] = gerador.nextInt(1000000);
        }
            return v;
    }
 
    private static void selectionSort(int[] array){
        for (int pos = 0; pos < array.length - 1; pos++){
            int menor = pos;
    
        for (int i = menor + 1; i < array.length; i++){
            if (array[i] < array[menor]) {
                menor = i;
            }
        }
        if (menor != pos){
            int j = array[pos];
            array[pos] = array[menor];
            array[menor] = j;
        }
        }
    }
}