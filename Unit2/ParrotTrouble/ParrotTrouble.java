public class ParrotTrouble
{
  public static boolean parrotTrouble(boolean talking, int hour)
  {
   return (talking && ( hour > 20 ||  hour < 7));

   }

  public static void testParrot(boolean talking, int hour, boolean expected)
  {

    boolean result = parrotTrouble(talking, hour);


    System.out.print("talking: " + talking +
                    "hour: " + hour +
                    "expected: " + expected +
                    "result: " + result + " ");

    if (result  == expected)
    {
      System.out.print("SAFE");
    }
    else
    {
      System.out.print("TROUBLE!");
    }
}




  public static void main(String[] args)
  {

    testParrot(true, 8, true);
    testParrot(false, 20, true);
    testParrot(true, 12, false);


  }


}
