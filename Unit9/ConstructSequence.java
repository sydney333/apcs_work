import java.util.*;
public class ConstructSequence{


public static ArrayList<Integer> getOriginalFib(int oFib){
  ArrayList<Integer> newFib = new ArrayList<Integer>();

  int a = 0;
  int b = 1;
    for(int i =0; i<20; i++){
      int c = a+b;
      newFib.add(c);
      a=b;
      b=c;

}
return newFib;
}




  public static void main(String[] args){
    ArrayList<Integer> totalFib = getOriginalFib(1);
      System.out.println(totalFib);


    }


}
