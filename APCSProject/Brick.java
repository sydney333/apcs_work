
import processing.core.*;
public class Brick{

  //platform class
  public Brick(PApplet e, PVector position){
    this.e = e;
    this.position = position.copy();
  }


  public void draw(){
    e.fill(255);
    e.rect(position.x, position.y ,100,25);

  }

  private PApplet e;
  private PVector position;



}
