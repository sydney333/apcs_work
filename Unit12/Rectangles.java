import java.util.*;
public class Rectangles{

  private String name;
  private double width;
  private double height;


  public Rectangles(String name, double width, double height){
    this.name = name;
    this.width = width;
    this.height = height;
  }


  public String getName(){
    return name;
  }
  public double getHeight(){
    return height;
  }
  public double getWidth(){
    return width;
  }

  public static double getPerimeter(double width, double height){
    double perimeter = 2*(width + height);

    System.out.println("Perimeter: " + perimeter);
    return perimeter;
  }


  public static double getArea(double width, double height){
    double area = width*height;

    System.out.println("Area: " + area);
    return area;

}


}
