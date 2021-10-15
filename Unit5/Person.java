public class Person{

private String name;
private int numberPets;

  public Person(String n, int p){
    name = n;
    numberPets = p;
}



  public String greeting(){
    return "Hello, my name is " + name + " and I have " + numberPets + " pets ";
  }

  public String returnName()
  {
    return name;
  }

  public int returnNumberPets()
  {
    return numberPets;
  }
}
