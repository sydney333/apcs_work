import java.util.*;
public class AnimalCalculator{


  public static void printAnimals(ArrayList<Animal> animals){
    for(Animal a : animals){
      System.out.println("NAME: " + a.getName()
       + " NUMBER OF LEGS: " + a.getLegCount()
       + "  FURRY?: " + a.getFurriness());
    }
  }

  public static float averageLegs(ArrayList<Animal> animals){
    float total = 0;
    for(Animal a : animals){
      total+=a.getLegCount();
    }
    return total/animals.size();
  }

  public static String fewestLegs(ArrayList<Animal> animals){
    Animal min = animals.get(0);
    for(Animal a : animals){
      if(a.getLegCount()< min.getLegCount()){
        min = a;
      }
    }
    return min.getName();
  }



  public static void main(String[] args){
    ArrayList<Animal> animals = new ArrayList<Animal>();
    Dog dogs = new Dog();
    animals.add(dogs);
    Cat cats = new Cat();
    animals.add(cats);
    Human humans = new Human();
    animals.add(humans);
    Centipede centipedes = new Centipede();
    animals.add(centipedes);

    printAnimals(animals);
    System.out.println("The animal with the least number of legs is: " + fewestLegs(animals));
    System.out.println("The average number of legs are: " + averageLegs(animals));
  }
}
