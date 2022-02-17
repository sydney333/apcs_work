
public class ArrayInitialization{

public static void printArray(int[][] values){
  for(int[] row: values){
    for(int value : row){
      System.out.print(value + " ");
    }
      System.out.println();
  }
  System.out.println();
}



public static void main(String[] args){
  int[][] values = new int[10][10];

  for(int i = 0; i<values.length; i++){
    for(int j = 0; j<values[i].length; j++){
      values[i][j] = 0;
      if(i == j){
        values[i][j] = 1;
      }
    }
  }

  printArray(values);


}
}
