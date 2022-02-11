import processing.core.*;
public class Brick{

  //platform class
  public Brick(PApplet e){
    this.e = e;
  }

  public void settings(){


  }

  public void setup(){

  }



  public void draw(){
    e.fill(255);
    e.rect(10,10,25,25);
  }

  private PApplet e;


}
