public class Teacher{
  public Teacher(String name, String subject){
    this.name = name;
    this.subject = subject;
  }

  public String getName(){
    return name;
  }

  public String getSubject(){
    return subject;
  }

  public String toString(){
    return name + "[" + subject + "]";
  }

  private String name;
  private String subject;
}
