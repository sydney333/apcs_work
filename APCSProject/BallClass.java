import processing.core.*;

public class BallClass{


public BallClass(PApplet p, PVector positionBall, PVector velocity){
  this.p = p;
  this.positionBall = positionBall.copy();
  this.velocity = velocity.copy();
}

  public void drawBall(){
    p.fill(0);
    positionBall.add(velocity);
    System.out.println(velocity + ", " + positionBall);
    p.ellipse(positionBall.x,positionBall.y,25,25);

  }

  public void checkWalls(){

      if (positionBall.x > p.width - 25/2 || positionBall.x < 25/2){
        velocity.x *= -1;
      }

      if(positionBall.y> p.height-25/2 || positionBall.y<25/2){
        velocity.y *= -1;
      }

  }

  public boolean isInside(PVector positions){
    if(positionBall.x == positions.x || positionBall.y == positions.y){
      return true;
    }
    return false;
  }


  private PApplet p;
  private PVector positionBall;
  private PVector velocity;


}
