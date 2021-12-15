public class TotalName{

  public static int countZname(String[] names){
    int count =0;

    for(String n:names){
      if((n.substring(0, 1).equals("Z"))||(n.substring(0, 1).equals("z"))){
        count+=n.length();
        System.out.println(n);
      }
    }
    return count;
  }

  public static void main(String[] args){
    String[] names = {"Sydney", "Zoo", "zorro"};
    int result = countZname(names);
    System.out.println(result);

  }
}
