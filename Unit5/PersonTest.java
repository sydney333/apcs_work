public class PersonTest{


  public static void main(String[] args){

    Person sydney = new Person("Sydney", 2);
    Person maddy = new Person("Maddy", 3);
    Person lauren = new Person("Lauren", 2);

    System.out.print(sydney.greeting());
    System.out.print(maddy.greeting());
    System.out.print(lauren.greeting());

  }


}
