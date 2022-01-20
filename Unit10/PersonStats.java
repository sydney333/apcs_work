import java.util.*;
public class PersonStats{

  public static float averagePets(ArrayList<Person> people){
    float total = 0;
    for(Person p : people){
      total+=p.getPets();
    }
    return total/people.size();

  }

  public static String highestPets(ArrayList<Person> people){
    Person max = people.get(0);
    for(Person p: people){
      if(p.getPets() > max.getPets()){
        max = p;
      }
    }
    return max.getName();

  }

  public static ArrayList<Person> twoPets(ArrayList<Person> people){
    ArrayList<Person> petCount = new ArrayList<Person>();
    Person morePets = people.get(0);
    for(Person pe: people){
      if(pe.getPets() > 2){
        petCount.add(pe);
        pe.getName();
      }
    }
    return petCount;

  }

  public static void main(String[] args){

    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("sydney", 2));
    people.add(new Person("lauren", 3));
    people.add(new Person("maddy", 1));
    people.add(new Person("darcy", 1));

    System.out.println("the average number of pets are: " + averagePets(people));

    System.out.println("the owner with the highest number of pets is: " + highestPets(people));

    System.out.println("the people with more than 2 pets are: " + twoPets(people));
  }
}
