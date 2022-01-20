public class Bicycle implements Vehicle{

  public Bicycle(String name, int wheels, boolean humanPower){

    this.name = name;
    this.wheels = wheels;
    this.humanPower = humanPower;

  }

  public String getName(){
    return "Bicycle";
  }

  public String toString(){
    return "Bicycle";
  }

  public int wheelCount(){
    return 1;
  }

  public boolean isHumanPowered(){
    return true;
  }

  private String name;
  private int wheels;
  private boolean humanPower;
}
