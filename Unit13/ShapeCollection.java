import java.util.*;

public class ShapeCollection{

  public ShapeCollection(){
    shapes = new ArrayList<Shape>();
  }

  //function add shape to ShapeCollection
  public void addShape(String name, int sides){
    shapes.add(new Shape(name, sides));
  }
/*function take shape name as input, looks up name,
and returns number of sides of shape: int numberOfSides(string shapeName)
*/
  public int numberOfSides(String name){
    int number = 0;
    for(Shape s: shapes){
      if(s.getName().equals(name)){
        s.getSides();
        number =s.getSides();
      }
    }
    return number;
  }

  //function that returns average number of sides in ShapeCollection
  public double findAverage(){
    double total = 0.0;

    for(Shape s:shapes){
      total+= s.getSides();
    }
    return total/shapes.size();
  }


  //function that returns ArrayList of shapes with even number of sides

  public ArrayList<Shape> findEvens(){
    ArrayList<Shape> even = new ArrayList<Shape>();

    for(Shape s: shapes){
      if(s.getSides()%2==0){
        even.add(s);
      }
    }
    return even;
  }

  private ArrayList<Shape> shapes;

  public static void main(String[] args){
    ShapeCollection coolShapes = new ShapeCollection();
    coolShapes.addShape("Triangle", 3);
    coolShapes.addShape("Rectangle", 4);
    coolShapes.addShape("Circle", 0);
    coolShapes.addShape("Octagon", 8);

    ArrayList<Shape> even = coolShapes.findEvens();

    System.out.println("average: " + coolShapes.findAverage());
    System.out.println("even numbers:" + coolShapes.findEvens());
    System.out.println("number of sides of triangle: " + coolShapes.numberOfSides("Triangle"));


  }
}
