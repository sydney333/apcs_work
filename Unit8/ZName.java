import java.util.*;
public class ZName
{

  public static string testNames(ArrayList<String> Names)
  {

    int total = 0;

    for(int i = 0; i<Names.size(); i++)
    {
      if(Names.substring(0,1) == "z")
      {
        System.out.println(Names + Names.size());
      }else{
        System.out.println(Names);
      }
    }
    return total;
  }

  public static void main(String[] args)
  {
    ArrayList<String> Names = new ArrayList<String>();
    Names.add("Sydney");
    Names.add("Maddy");
    Names.add("Zorro");
    System.out.println(testNames(Names));
  }
}
