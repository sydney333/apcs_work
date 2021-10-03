public class Attention{

  public static boolean Attention(String sentence){

    if (sentence.substring(0,6).equals("Please")){
      return false;

    }
else {
  return true;
}
  }

  public static void main(String[] args){

    String s1 = "Please pass the sugar";
    System.out.print(s1 + ": " + Attention(s1));
    String s2 = "Pass the sugar";
    System.out.print(s2 + ": " + Attention(s2));


}
}
