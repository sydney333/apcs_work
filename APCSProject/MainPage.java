import java.util.*;
import processing.core.*;

public class MainPage extends PApplet{


    public void settings(){
      size(960,540);


    }

    public void setup(){
      textAlign(CENTER);
      gameState = "START";

      gameStates  = new ArrayList<StateFunctions>();
      homePage = new HomePage(this);
      gameStates.add(homePage);
      levelOne = new LevelOne(this);
      gameStates.add(levelOne);
      avatar = new Avatar(this);
    }


    public void draw(){
      background(0);


      if(gameState.equals("START")){
        homePage.run();
        homePage.state();
      }

      if(gameState.equals("ONE")){

        levelOne.run();
        levelOne.state();
        avatar.draw();


      }


      gameStates.get(current).run();
      gameStates.get(current).state();




    }
    public void keyPressed(){
      //gameStates.get(current).keyPressed();
      if (gameState.equals("START"))
      {
          current = 1;
        //  gameState.equals("ONE");
      //   avatar.draw();

      }
    }

    private String gameState;
    private HomePage homePage;
    private LevelOne levelOne;
    private ArrayList<StateFunctions> gameStates;
    public int current = 0;
    private Avatar avatar;

    public static void main(String[] args){
        PApplet.main("MainPage");

    }
}
