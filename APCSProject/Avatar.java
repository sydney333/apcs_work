import processing.core.*;
public class Avatar{


public Avatar(PApplet l){
  this.l = l;
  this.position = new PVector(l.width/2, l.height/2);
  this.velocity = new PVector(0, 0);
  platform = l.loadImage("platform.png");
  platform.resize(200, 100);
}


public void draw(){
  l.fill(0);
  l.image(platform, position.x, position.y+200);

  PVector newPos = position.copy();
  newPos.add(velocity);
  if(checkEdge(newPos) == true){
    position = newPos.copy();
  }

}

public void moveRight(){
  velocity.x += .5f;
}

public void moveLeft(){
  velocity.x -= .5f;
}

public void stopMove(){
  velocity.x = 0;
}

public boolean checkEdge(PVector newPos){
  if(newPos.x >= l.width-130){
    return false;
  }

  else if(newPos.x<= -50){
    return false;
  }
  return true;
}



private PImage platform;
private PApplet l;
private PVector position;
private PVector velocity;


}
