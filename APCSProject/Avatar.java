import processing.core.*;
public class Avatar{


public Avatar(PApplet l){
  this.l = l;
  platform = l.loadImage("platform.png");
  platform.resize(100, 50);
}

public void settings(){

}

public void setup(){



}

public void draw(){
  l.image(platform, 430, 500 );

}

public static void main(String[] args){

  
}
private PImage platform;
private PApplet l;


}
