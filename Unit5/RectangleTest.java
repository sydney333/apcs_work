public class RectangleTest{

  public static void testPerimeter(Rectangle rectangle, double expected)
  {
    double result = rectangle.perimeter();

    System.out.print("expected: " + expected + " result: " + result);

    if(Math.abs(expected-result)<.01){
      System.out.print("yay");
    }
    else
    {
      System.out.print("boo");
    }
    }



  public static void main(String[] args){

    Rectangle r = new Rectangle(2,3);

    System.out.print("r.area: " + r.area());
    System.out.print("r.perimeter: " + r.perimeter());
    System.out.print("r.diagonal: " + r.diagonal());


    testPerimeter(r, 10);


  }


}
