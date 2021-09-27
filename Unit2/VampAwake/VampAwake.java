public class VampAwake{

  public static boolean VampAwake(float hour, boolean awake){
    return ((hour>22 && hour<24.9) || (hour>0 && hour<6));

  }
  public static void testVampAwake(float hour, boolean awake, boolean expected){

    boolean result = VampAwake(hour, awake);

    System.out.println( "time: " + hour
                      + "Awake: " + awake
                      + "Expected: " + expected
                      + "Result: " + result);

                      if (result  == expected)
                        {
                        System.out.print("true");
                        }
                          else
                        {
                        System.out.print("false!");
                        }
                    }
  public static void main(String[] args){
    testVampAwake(3, true, true);
    testVampAwake(20, false, true);

  }


}
