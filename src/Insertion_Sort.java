//import java.util.Arrays;
import java.util.Random;

public class Insertion_Sort {
  public static void main(String[] args){
    int[] v = VetRandom(10);

      long ini = System.currentTimeMillis();
        
      InsertionSort(v);       

      long fin = System.currentTimeMillis();

      //System.out.println(Arrays.toString(v));                       //comando para mostrar o vetor já ordenado

      System.out.println("Tempo: " + (fin - ini) + " ms");
  }

  public static int[] VetRandom(int aux){
      int [] v = new int[aux];
        Random gerador = new Random();
          for (int i = 0; i < aux; i++){
              v[i] = gerador.nextInt(10);
          }
          return v;
  }
 
  private static void InsertionSort(int[] v){
      int j;
      int key;
      int i;
        
      for (j = 1; j < v.length; j++){
          key = v[j];
            for (i = j - 1; (i >= 0) && (v[i] > key); i--){
              v[i + 1] = v[i];
            }
              v[i + 1] = key;
      }
  }
}