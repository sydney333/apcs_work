public class Rectangle{

  private double h;
  private double b;

  public Rectangle(double h, double b){
    this.h = h;
    this.b = b;
  }

  public double perimeter()
  {
    return (2*h) + (2*b);
  }

  public double area(){
    return h*b;
  }

  public double diagonal(){
    return Math.sqrt((h*h) + (b*b));


  }


}
