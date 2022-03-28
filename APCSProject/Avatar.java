import processing.core.*;
public class Avatar{


public Avatar(PApplet l){
  this.l = l;
  PVector positionAvatar = new PVector(l.width/2, l.height/2);
  PVector velocityAvatar = new PVector(-1,1);
  platform = l.loadImage("platform.png");
  platform.resize(200, 100);
}


public void draw(){
  l.fill(0);
  l.image(platform, positionAvatar.x, positionAvatar.y+200);

  PVector newPos = positionAvatar.copy();
  newPos.add(velocityAvatar);
  if(checkEdge(newPos) == true){
    positionAvatar = newPos.copy();
  }

}

public void moveRight(){
  velocityAvatar.x += .5f;
}

public void moveLeft(){
  velocityAvatar.x -= .5f;
}

public void stopMove(){
  velocityAvatar.x = 0;
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
private PVector positionAvatar;
private PVector velocityAvatar;


}
