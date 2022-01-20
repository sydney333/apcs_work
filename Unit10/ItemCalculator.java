import java.util.*;

public class ItemCalculator{

  public static void printItems(ArrayList <Items> item){
    for(Items i: item){
    System.out.println("The " + i.getName() + " is $" + i.getPrices() + ".");
  }
}

  public static float averagePrice(ArrayList <Items> item){
    float total = 0;
    for(Items i : item){
      total+=i.getPrices();
    }
    return total/item.size();
  }

  public static String mostExpensive(ArrayList <Items> item){
  Items max = item.get(0);
    for(Items i: item){
      if(i.getPrices() > max.getPrices()){
        max = i;
      }
    }
    return max.getName();
  }


  public static void main(String[] args){
    ArrayList<Items> item = new ArrayList<Items>();
    item.add(new Items("ball", 2.50f));
    item.add(new Items("dollhouse", 15.50f));
    item.add(new Items("cat toy", 4.75f));

    printItems(item);

    System.out.println("The average price: $" + averagePrice(item));
    System.out.println("The most expensive item is the " + mostExpensive(item));

}
}
