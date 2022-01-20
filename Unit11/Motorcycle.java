public class Motorcycle implements Vehicle{

  public Motorcycle(String name, int wheels, boolean humanPower){
    this.name = name;
    this.wheels = wheels;
    this.humanPower = humanPower;
  }

  public String getName(){
    return "motorcycle";
  }

  public int wheelCount(){
    return 2;
  }

  public boolean isHumanPowered(){
    return false;
  }

  private String name;
  private int wheels;
  private boolean humanPower;
}
