public class MissingChar{

public static String MissingChar(String str, int n) {
  String start = str.substring(0,n);
  String end = str.substring(n+1, str.length());

  return start + end;
}

public static void testMissingChar(String str, int n, boolean expected){
  String result = MissingChar(str, n);

  System.out.print("Phrase: " + str + ", int: " + n + "expected: "
   + expected + "result " + result);


}

public static void main(String[] args){
  testMissingChar("kitten", 1, true);
  testMissingChar("Sydney", 2, true);
  testMissingChar("computers", 4, true);
}
}
