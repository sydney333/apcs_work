
import java.util.*;


public class CountList
{
    public static int testNum(ArrayList<Integer> numbers)
    {
      int count = 0;



        for(int i =0 ; i<numbers.size(); i++)
        {
          if(numbers.get(i)== 7 || numbers.get(i)%10==7)
          {
            count++;
          }
        }
        return count;
      }



    public static void main(String[] args)
    {

      ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(17);


    int result = testNum(numbers);

    System.out.println("Number of 7s: " + result);





  }
}


//difference between array and arraylist
// use size instead of length, use get (i) instead of [i]

//size doesn't change in array, arrayLists allow size to change
