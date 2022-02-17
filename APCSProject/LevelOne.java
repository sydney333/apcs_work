
import processing.core.*;
import java.util.*;
public class LevelOne implements StateFunctions{

  public LevelOne(PApplet a){
    this.a = a;


    bricks = new ArrayList<Brick>();
    intializeArray();


    backgroundOne = a.loadImage("one.png");
    backgroundOne.resize(a.width, a.height);
  //  gameState = "ONE";
  }

  public void intializeArray(){
    for(int i=0; i<4; i++){
      for(int j=0; j<5; j++){
        PVector position = new PVector(a.width*j/5.0f, a.height*i/4.0f);
        Brick b = new Brick(this.a, position);
        bricks.add(b);
      }
    }
  }


  public void run(){

    a.image(backgroundOne, 0,0);
    a.textSize(20);
    a.text("Level 1", 40, 40);

    for(Brick b : bricks){
      b.draw();
}

//    createBrick();
  }


  public void keyPressed(){

  }

  public String state(){
    return "ONE";
  }

  private PImage backgroundOne;
  private PApplet a;
  private ArrayList<Brick> bricks;
  private PVector position;
  private Brick b;

}
