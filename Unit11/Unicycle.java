public class Unicycle implements Vehicle{

  public Unicycle(String name, int wheels, boolean humanPower){
    this.name = name;
    this.wheels = wheels;
    this.humanPower = humanPower;
  }

  public String getName(){
    return "Unicycle";
  }

  public int wheelCount(){
    return 1;
  }

  public String toString(){
    return "Unicycle";
  }

  public boolean isHumanPowered(){
    return true;
  }

  private String name;
  private int wheels;
  private boolean humanPower;
}
