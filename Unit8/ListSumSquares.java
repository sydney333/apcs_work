import java.util.*;

public class ListSumSquares
{

  public static double testList(ArrayList<Double> Sums)
  {

    int total = 0;


    for(int i = 0; i<Sums.size(); i++){
      total += (Sums.get(i)*Sums.get(i));
  }
    return total;

  }

  public static void main(String[] args)
  {
ArrayList<Double> Sums = new ArrayList<Double>();
Sums.add(1.0);
Sums.add(2.0);
Sums.add(3.0);
Sums.add(4.0);

    System.out.println("Sum of Squares: " + testList(Sums));




  }



}
