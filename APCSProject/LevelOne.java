
import processing.core.*;
import java.util.*;
public class LevelOne implements StateFunctions{

  public LevelOne(PApplet a, Avatar avatar){
    this.a = a;
    this.avatar = avatar;



    bricks = new ArrayList<Brick>();
    intializeBrickArray();

    balls= new ArrayList<BallClass>();
    balls.add(new BallClass(this.a, new PVector(a.width/2, a.height-450), new PVector(2,2)));

    backgroundOne = a.loadImage("one.png");
    backgroundOne.resize(a.width, a.height);

    score = 0;
    //  gameState = "ONE";
  }

  public void intializeBrickArray(){
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        PVector position = new PVector(a.width*i/9.0f+150, a.height*j/20.0f+50);
        Brick b = new Brick(this.a, position);
        bricks.add(b);
      }
    }
  }

  public void displayScore(){
    a.textSize(20);
    a.fill(0);
    a.text("Score: " + score, 40, 80);
  }


  public void run(){
    a.imageMode(a.CORNER);
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
      ball.checkAvatarBall(avatar);
      ball.checkGroundDie();
      brickCheck();
    }
  }
  public boolean hitSide(float x, float y, float ballX, float ballY, BallClass ball){
    if(ballX==x && ballY>=y && ballY<=y+25){
      ball.changeXVel();
      return true;
    }
    return false;
  }
  public boolean hitTopBot(float x, float y, float ballX, float ballY, BallClass ball){
    if(ballY== y && ballX>=x && ballX<=x+150){
      ball.changeYVel();
      return true;
    }
    return false;
  }

  public boolean hitBrick(PVector position, BallClass ball){
    //make variable for ballx ballY brickx bircky
    //check every side of rect (left, right, top, and bottom)
    //check within top of brick (x), if the x of the ball is the same => same plane
    //same w x along top (if x>=brickX && x<= brickX+150)
    float ballX, ballY, x, y;
    ballX = ball.getBallPos().x;
    ballY = ball.getBallPos().y;
    x = position.x;
    y = position.y;

    return hitSide(x,y,ballX,ballY,ball) || hitSide(x+150,y,ballX,ballY,ball) ||
    hitTopBot(x,y,ballX,ballY,ball) || hitTopBot(x,y+25,ballX,ballY,ball);

  }


  public void brickCheck(){


    for(BallClass ball: balls){

      for(Brick b: bricks){
        //if brick is hit, remove from arrayList of bricks
        //make invisible
        //break, don't need to cycle through rest after finding brick hit
        if(hitBrick(b.getPosition(), ball)){
          score++;
          b.disappear();
          bricks.remove(b);
          ball.incrementVel();
          break;
        }
      }
    }

    //feild is instacne variable or constant of class
    //velocity.y*=-1;
    //velocity.x*=-1;
    //condition if ball hits side change x velocity
    //if hits top/bottom change y velocity
    //  score++;
  }

  public int getScore(){
    return score;
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
  //private PVector position;
  //private PVector positionBall;
  private Brick b;
  //private BallClass ball;
  private PVector velocity;
  private Avatar avatar;
  private int score;


}
