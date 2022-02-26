public class Rectangles{

  private String name;
  private double width;
  private double height;

  public Rectangles(String name, double width, double height){
    this.name = name;
    this.width = width;
    this.height = height;
  }

  public static double perimeter(double width, double height){
    double p = 2*(width + height);

    System.out.println("Perimeter: " + p);
    return p;

  }

  public static double area(double width, double height){
    double a = width*height;

    System.out.println("Area: " + a);
    return a;
  }

  public String getName(){
    return this.name;
  }
  public double getHeight(){
    return this.height;
  }
  public double getWidth(){
    return this.width;
  }

  public static void main(String[] args){
    perimeter(10.0,15.0);
    area(10.0,15.0);
  }


}
