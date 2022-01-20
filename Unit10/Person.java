import java.util.*;
public class Person{

  private String name;
  private int pets;

  public Person(String name, int pets){
    this.name = name;
    this.pets = pets;
  }

  public int getPets(){
    return pets;
  }
  public String getName(){
    return name;
  }

  public String toString(){
    return name;
  }
}
