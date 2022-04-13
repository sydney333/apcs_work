public class Student{

  public Student(String name, int favNum){
    this.name = name;
    this.favNum = favNum;
  }

  public String getName(){
    return name;
  }

  public int getFavNum(){
    return favNum;
  }
  public String toString(){
        return name + "[" + favNum + "]";
  }

  private String name;
  private int favNum;
}
