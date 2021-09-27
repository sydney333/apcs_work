public class PosNeg
{
public static boolean PosNeg(int a, int b, boolean negative) {
  if (negative){
    return( a<0 && b<0);
  }
  else{
    return((a<0 && b>0) || (a>0 && b<0));
  }
}
public static void testPosNeg(int a, int b, boolean negative, boolean expected)
{
  boolean result = PosNeg(a, b , negative);

  System.out.print( "a value: " + a
                  + "b value: " + b
                  + "negative: " + negative
                  + "expected: " + expected
                  + "result: " + result +   " "
                  );
  if (result  == expected)
    {
    System.out.print("true!");
    }
      else
    {
    System.out.print("false!");
    }
}
public static void main(String[] args)
{
  testPosNeg(5, -2, true, false);
  testPosNeg(-2,-5, true, true);
  testPosNeg(-1, -5, false, ture);

}

}
