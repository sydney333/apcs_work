import java.util.*;
import processing.core.*;

public class MainPage extends PApplet{


    public void settings(){
      size(960,540);
    }

    public void setup(){
      textAlign(CENTER);

      gameStates  = new ArrayList<StateFunctions>();
      homePage = new HomePage(this);
      gameStates.add(homePage);
      levelOne = new LevelOne(this);
      gameStates.add(levelOne);
      avatar = new Avatar(this);
//      brick = new Brick(this, position);

    }


    public void draw(){
      background(0);


    gameStates.get(current).run();
    gameStates.get(current).state();
    if( current>0){

    avatar.draw();
  //  brick.draw();
  }


    }
    public void keyPressed(){

      if (current==0 )
      {
          current = 1;
      }else if(current>0){
        if(keyCode == RIGHT){

          avatar.moveRight();

        }
        if(keyCode == LEFT){

          avatar.moveLeft();

        }
      }
    }
    public void keyReleased(){
      if(current>0){
        avatar.stopMove();
      }
    }
//key releasd set velocity back to o, during key pressed, velocity is a number

    private HomePage homePage;
    private LevelOne levelOne;
    private ArrayList<StateFunctions> gameStates;
    public int current = 0;
    private Avatar avatar;
  // private Brick brick;


    public static void main(String[] args){
        PApplet.main("MainPage");

    }
}
