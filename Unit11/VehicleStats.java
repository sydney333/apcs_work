import java.util.*;
public class VehicleStats{

  public static void printVehicles(ArrayList<Vehicle> vehicles){
    for(Vehicle v: vehicles){
      System.out.println("TYPE: " + v.getName() + " "
      + "WHEEL COUNT: " + v.wheelCount() + " "
      + "HUMAN-POWERED? : " + v.isHumanPowered());
    }
  }

  public static int totalWheels(ArrayList<Vehicle> vehicles){
  int total = 0;
    for(Vehicle v: vehicles){
      total+=v.wheelCount();
    }
    return total;
  }

  public static ArrayList<Vehicle> testPower(ArrayList<Vehicle> vehicles){
    ArrayList<Vehicle> poweredTest = new ArrayList<Vehicle>();
    Vehicle powered = vehicles.get(0);
    for(Vehicle v: vehicles){
      if(v.isHumanPowered() == true){
        poweredTest.add(v);
        v.getName();
      }
    }
    return poweredTest;
  }

  public static void main(String[] args){
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Car("Car", 4, false));
    vehicles.add(new Motorcycle("Motorcycle", 2, false));
    vehicles.add(new Unicycle("Unicycle", 1, true));
    vehicles.add(new Bicycle("Bicycle", 2, true));
    printVehicles(vehicles);
    System.out.println("The total number of wheels are: " + totalWheels(vehicles));
    System.out.println("The human powered vehicles are: " + testPower(vehicles));
  }
}
