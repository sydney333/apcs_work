public class FizzBuzz{

  public static void main(String[] args){

    for(int i = 0; i<30; i++){
      if(i%3==i*3){
        System.out.println("Fizz");
      }
      else if(i%5==i*5){
        System.out.println("Buzz");
      }
      else if(i%2==i*3 && i%4==i*5){
        System.out.println("FizzBuzz");
      }
      else{
        System.out.println(i);
      }
      }
      }
    }
