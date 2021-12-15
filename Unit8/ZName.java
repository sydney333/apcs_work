import java.util.*;
public class ZName
{

  public static int testNames(ArrayList<String> people)
  {
    int total = 0;

      for(String p : people){
        if(p.substring(0,1).equals("Z")){
          total += p.length();
          System.out.println(p);
        }

    }
      return total;
  }


  public static void main(String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Sydney");
    names.add("Maddy");
    names.add("Zorro");
    System.out.println(testNames(names));
  }
}
