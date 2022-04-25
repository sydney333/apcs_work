import java.util.*;
import processing.core.*;

public class MainPage extends PApplet{

    public void settings(){
      fullScreen();
    }

    public void setup(){
      textAlign(CENTER);
      avatar = new Avatar(this, positionAvatar, velocityAvatar);

      gameStates  = new ArrayList<StateFunctions>();
      homePage = new HomePage(this);
      gameStates.add(homePage);
      levelOne = new LevelOne(this, avatar);
      gameStates.add(levelOne);
      lostPage = new LostPage(this);
      gameStates.add(lostPage);

      current = 0;
    }


    public void draw(){
      background(0);

        gameStates.get(current).run();
        gameStates.get(current).state();
        if(current==1){
          avatar.draw();
        }
    }
    public void setCurrent(int x){
      current = x;
    }

    public void reset(){
      setCurrent(0);
      homePage = new HomePage(this);
      homePage.run();
      homePage.state();
      homePage.settings();
      //System.out.println(gameStates.get(current).state());
    }

    public void keyPressed(){

      if (current==0 ){
          current = 1;
        //  System.out.println(gameStates.get(current).state());
      }else if(current==1){
        if(keyCode == RIGHT){
          avatar.moveRight();
        }
        if(keyCode == LEFT){
          avatar.moveLeft();
        }
      }else if(current==2){
        reset();
      }
    }


    public void keyReleased(){
      if(current>0){
        avatar.stopMove();
      }
    }

//key releasd set velocity back to o, during key pressed, velocity is a number

    private HomePage homePage;
    private LostPage lostPage;
    private LevelOne levelOne;
    private ArrayList<StateFunctions> gameStates;
    public static int current;
    private Avatar avatar;
    private PVector positionAvatar;
    private PVector velocityAvatar;
  // private Brick brick;


    public static void main(String[] args){
        PApplet.main("MainPage");

    }
}
