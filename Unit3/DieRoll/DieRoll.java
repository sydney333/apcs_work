public class DieRoll{

  public static void main(String[] args){

    int max = 7;
    int min = 1;
    int range = max - min;

    for(int i =0; i<1; i++){
      int rand =(int)(Math.random() * range) + min;
      System.out.print(rand);
    }



  }





}
