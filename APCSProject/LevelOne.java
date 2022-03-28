
import processing.core.*;
import java.util.*;
public class LevelOne implements StateFunctions{

  public LevelOne(PApplet a){
    this.a = a;


    bricks = new ArrayList<Brick>();
    intializeBrickArray();

    balls= new ArrayList<BallClass>();
    initializeBallArray();


    backgroundOne = a.loadImage("one.png");
    backgroundOne.resize(a.width, a.height);
  //  gameState = "ONE";
  }

  public void intializeBrickArray(){
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        PVector position = new PVector(a.width*i/9.0f+100, a.height*j/20.0f + 25);
        Brick b = new Brick(this.a, position);
        bricks.add(b);
      }
    }
  }

  public void initializeBallArray(){
    for(int i=0; i<2; i++){
      PVector positionBall = new PVector(a.width/2, 50);
      PVector velocity = new PVector(2,2);
      BallClass ball = new BallClass(this.a, positionBall, velocity);
      balls.add(ball);
    }
  }

  public void displayScore(){
    int score = 0;
    a.textSize(20);
    a.fill(0);
    a.text("Score: " + score, 40, 80);
  }


  public void run(){

    a.image(backgroundOne, 0,0);
    a.textSize(20);
    a.text("Level 1", 40, 40);
    displayScore();

    for(Brick b : bricks){
      b.draw();
    }

    for(BallClass ball : balls){
      ball.drawBall();
      ball.checkWalls();

  /*  for(Avatar a: avatars){
      if(ball.isInside(a.position.x(), a.position.y())){
        ball.velocity*= -1;
      }*/
    }
  }




  public void keyPressed(){

  }

  public String state(){
    return "ONE";
  }

  private PImage backgroundOne;
  private PApplet a;
  private ArrayList<Brick> bricks;
  private ArrayList<BallClass> balls;
  private PVector position;
  private PVector positionBall;
  private Brick b;
  private BallClass ball;
  private PVector velocity;

}
