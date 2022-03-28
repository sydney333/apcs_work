import java.util.*;
public class RectangleFunctions{

    public static double averagePerimeter(Rectangles[][] values){
      double total = 0.0;
      int count = 0;
      for(int row = 0; row<values.length; row++){
        for(int column = 0; column<values[row].length; column++){
          total+=values[row][column];
          count++;
        }
      }

      return total/count;


  }

    public static double greatestArea(Rectangles[][] values){
      double greatest = values[0][0].getArea();

      for(int row = 0; row<values.length; row++){
        for(int column = 0; column<values[row].length; column++){
            double current = values[row][column];
          if(current.getArea() > greatest.getArea()){
            greatest = current;

      }
    }
  }
      return greatest;
    }

    public static void main(String[] args){

      Rectangles[][] values = new Rectangles[3][3];
      values[0][0] = new Rectangles("one", 3, 5);
      values[1][1] = new Rectangles("two", 2, 4);
      values[2][2] = new Rectangles("three", 5, 7);

      double result = averagePerimeter(values);
      System.out.println("average perimeter: " + result);
   System.out.println("greatest area: " + greatestArea(values));
    }
}
