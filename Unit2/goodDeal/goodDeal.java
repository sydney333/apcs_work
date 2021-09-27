public class goodDeal{

  public static boolean goodDeal(int oPrice, int salePrice, boolean goodDeal){
return(salePrice<.75*oPrice);


  }

public static void testGoodDeal(int oPrice, int salePrice, boolean goodDeal, boolean expected){
  boolean result = goodDeal(oPrice, salePrice, goodDeal);

  System.out.print( "Original Price: " + oPrice
                  + "Sale Price: " + salePrice
                  + "Good deal? " + goodDeal
                  + "expected: "  + expected
                  + "result: " + result);

                  if (result  == expected)
                    {
                    System.out.print("true!");
                    }
                      else
                    {
                    System.out.print("false!");
                    }


}

public static void main(String[] args){

  testGoodDeal(10, 5, true, true);


  }

}
