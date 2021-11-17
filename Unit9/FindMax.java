//find max from arraylist
import java.util.*;

public class FindMax{

  public static float findMaximum(float[] numbers){
    //ArrayList<Float> numbers = new ArrayList<Float>;

    if(numbers.length == 0){
      return -1;
    }

    float max = numbers[0];

    for(float x : numbers){
      if(x>max){
        max=x;
}
}
 return max;
}

public static void main(String[] args){
  float[] numbers = {20.0f, 30.0f, 50.0f};
  System.out.println("Maximum score: " + findMaximum(numbers));


}


}
