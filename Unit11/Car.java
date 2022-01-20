public class Car implements Vehicle{
  //function that takes ArrayList of vehicle objects and computes total number of wheels
  //function that takes arraylist and returns arraylist representing vehicles that are humanpowred

  public Car(String name, int wheels, boolean humanPower){
    this.name = name;
    this.wheels = wheels;
    this.humanPower = humanPower;
  }

  public String getName(){
    return "Car";
  }

  public int wheelCount(){
    return 4;
  }

  public boolean isHumanPowered(){
    return false;
  }

  private String name;
  private int wheels;
  private boolean humanPower;


}
