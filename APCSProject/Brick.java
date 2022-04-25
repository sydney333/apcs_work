
import processing.core.*;
public class Brick{

  //platform class
  public Brick(PApplet e, PVector position){
    this.e = e;
    this.position = position.copy();
  }


  public void draw(){
    e.fill(255);
    e.rect(position.x, position.y ,150,25);

  }

  public PApplet getE(){
    return e;
  }

  public PVector getPosition(){
    return position;
  }

  public void disappear(){
    e.fill(255,0);
  }
  

  private PApplet e;
  private PVector position;



}
