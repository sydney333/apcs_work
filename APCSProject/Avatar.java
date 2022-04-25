import processing.core.*;
public class Avatar{


public Avatar(PApplet l, PVector positionAvatar, PVector velocityAvatar){
  this.l = l;
  this.positionAvatar = new PVector(l.width/2,l.height-200);
  this.velocityAvatar = new PVector(0,0);
  platform = l.loadImage("platform.png");

  avatarW = 200;
  avatarH = 100;
  platform.resize(avatarW, avatarH);
}


public void draw(){
  l.imageMode(l.CENTER);
  l.fill(0);
  l.image(platform, positionAvatar.x, positionAvatar.y);

  PVector newPos = positionAvatar.copy();
  newPos.add(velocityAvatar);
  if(checkEdge(newPos) == true){
    positionAvatar = newPos.copy();
  }

}

public void moveRight(){
  velocityAvatar.x = 5f;
}

public void moveLeft(){
  velocityAvatar.x = -5f;
}

public void stopMove(){
  velocityAvatar.x = 0;
}

public boolean checkEdge(PVector newPos){
  if(newPos.x >= l.width){
    return false;
  }

  else if(newPos.x<= 0){
    return false;
  }
  return true;
}
public float getPosX(){
  return positionAvatar.x;
}
public float getPosY(){
  return positionAvatar.y;
}
public float getVelX(){
  return velocityAvatar.x;
}
public float getVelY(){
  return velocityAvatar.y;
}
public int getH(){
  return avatarH;
}

public int getW(){
  return avatarW;
}


private PImage platform;
private PApplet l;
private PVector positionAvatar;
private PVector velocityAvatar;
private int avatarH;
private int avatarW;


}
