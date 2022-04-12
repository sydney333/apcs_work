
public class Shape{

  public Shape(String name, int sides){
    this.name = name;
    this.sides = sides;
  }

  public String getName(){
    return name;
  }

  public int getSides(){
    return sides;
  }

  public String toString(){
        return name + "[" + sides + "]";
  }


  private String name;
  private int sides;

}
