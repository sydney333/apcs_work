public class NearHundred
{
public static boolean nearHundred(int n){
  return((Math.abs(100-n)<=10) || (Math.abs(200-n) <= 10));

}
public static void testnearHundred(int n, boolean expected){

  boolean result = nearHundred(n);

  System.out.print(
   "Integer: " + n + " "
   + "Expected: " + expected + " "
   + "Result: " + result + " "
  );
}
public static void main(String[] args){

  testnearHundred(190, true);
  testnearHundred(188, false);
  testnearHundred(98,true);
  testnearHundred(102, true);
  testnearHundred(189, false);

  }
}
