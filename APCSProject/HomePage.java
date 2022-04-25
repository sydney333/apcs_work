import processing.core.*;
public class HomePage implements StateFunctions {

public HomePage(PApplet p){
    this.p = p;

    backgroundStart = p.loadImage("home.png");
    backgroundStart.resize(p.width, p.height);
    p.print("in home ");
    //  p.print(current);

}

public void settings(){
    p.fullScreen();
}


public void run(){

  p.image(backgroundStart, 0,0);
  p.fill(0);

  p.textSize(100);
  p.text("Brick Breaker", p.width/2, p.height/2);

  p.textSize(50);
  p.text("By: Sydney Adamson", p.width/2, p.height/2+100);

  p.textSize(10);
  p.text("©2022", p.width-20, p.height-20);

}

public void keyPressed(){

}

public String state(){
  return "Home";
}


private PImage backgroundStart;
private PApplet p;
//private String gameState;
//public int current;

}
