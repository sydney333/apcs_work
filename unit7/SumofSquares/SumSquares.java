public class SumSquares{

  public static void main(String[] args){
    int[] array = {1,2,3,4};
    int total = 0;


    for(int i : array){
      System.out.println("Values: " + i);
      total += (i*i);
    }

      System.out.println("Sum of squares: " + total);
  }







}
