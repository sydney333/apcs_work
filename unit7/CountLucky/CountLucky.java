public class CountLucky {

  public static int countLucky(int[] numbers){

    int count = 0;
    for(int i =0 ; i<numbers.length; i++)
    {
      if(numbers[i] == 7 || numbers[i]%10==7)
      {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[] numbers = {7,67,1};

    int result = countLucky(numbers);
    System.out.println("numbers with 7's: " + result);

  }





}
