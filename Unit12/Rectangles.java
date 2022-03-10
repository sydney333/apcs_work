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
  public static double averagePerimeter(int[][] values){
    double total = 0.0;
    int count = 0;
    for(int[] row: values){
      for(int value : row)
      {
        total += (value + value)*2;
        count++;
      }
    }
    return total/count;

  }

  public static double greatestArea(int[][] values){
    double total = 0.0;
    double greatest = 0.0;

    for(int i = 0; i<values.length; i++){
      for(int j = 0; j<values[i].length; j++){
        total += values[0]*values[0];
        if(greatest>total-1){
          greatest = total;
        }

      }
    }
    return greatest;

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
 int[][] values = {{3,5}, {2,4}, {5,7}};
 /*
 for(int i = 0; i<values.length; i++){
   for(int j = 0; j<values[i].length; j++){
     total+=(2.0*(values[i] + values[j]))/3.0;
     System.out.println("Average perimeter: " + total);

   }

 }
 */

    perimeter(10.0,15.0);
    area(10.0,15.0);
    double result = averagePerimeter(values);
    System.out.println("average perimeter: " + result);
    System.out.println(greatestArea(values));
  }


}
