public class TotalName{
  public static int countZname(String[] names){
    int result = names;
    for(String name : names)
    {
      if(name.substring(0,1) == "z")
      {
        System.out.println(name + name.length());
      }else{
        System.out.println(name);
      }
    }
    return result;
  }

  public static void main(String[] args)
  {
    String[] names = {"Sydney", "Maddy", "Zorro"};

    int result = countZname(names);
    System.out.println(result);
  }
}
