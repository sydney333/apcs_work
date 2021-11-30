import java.util.*;
public class FilterScores{


  public static ArrayList<Float> filterScores(float[] scores){

    ArrayList<Float> results = new ArrayList<Float>();

    for (float s : scores){
      if(s>=90.0){
        results.add(s);
      }
    }return results;

  }

  public static void main(String[] args){
    float[] scores = {80.0f, 81.0f, 90.0f, 95.0f, 100.0f};
    System.out.println("Good scores: " + filterScores(scores));



  }
}
