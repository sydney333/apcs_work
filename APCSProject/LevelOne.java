import processing.core.*;
public class LevelOne implements StateFunctions{

  public LevelOne(PApplet a){
    this.a = a;

    width = 960;
    height = 540;

    backgroundOne = a.loadImage("one.png");
    backgroundOne.resize(width, height);
  //  gameState = "ONE";
    a.print("in levelOne ");
  //  a.print(current);


  }

  public void settings(){

  }

  public void run(){

    a.image(backgroundOne, 0,0);
    a.textSize(20);
    a.text("Level 1", 40, 40);
    


  }

  public void keyPressed(){

  }

  public String state(){
    return "ONE";
  }

  private PImage backgroundOne;
  private PApplet a;
  private int height;
  private int width;
//  public String gameState;
//  public int current;
}
