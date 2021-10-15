public class StringTimes{

  public static String StringTimes(String s, int n){
    String result = "";
    for(int i =0; i<n; i++){
      result+=s;
    }
    return result;
  }

  public static void main(String[] args){
    System.out.print(StringTimes("Hi ", 3));
    System.out.print(StringTimes("Sydney ", 5));
    System.out.print(StringTimes("APCS ", 7));
  }



}
