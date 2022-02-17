import processing.core.*;
public class HomePage implements StateFunctions {

public HomePage(PApplet p){
    this.p = p;

    width = 960;
    height = 540;

    backgroundStart = p.loadImage("home.png");
    backgroundStart.resize(width, height);
    p.print("in home ");
    //  p.print(current);

}

public void settings(){

}


public void run(){

  p.image(backgroundStart, 0,0);
  p.fill(0);

  p.textSize(100);
  p.text("Brick Breaker", width/2, height/2);

  p.textSize(50);
  p.text("By: Sydney Adamson", width/2, height/2+100);

  p.textSize(10);
  p.text("©2022", width-20, height-20);

}

public void keyPressed(){
  
}

public String state(){
  return "Home";
}


private PImage backgroundStart;
private PApplet p;
private int height;
private int width;
//private String gameState;
//public int current;

}
