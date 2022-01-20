import java.util.*;
import processing.core.*;

public class PracticeDoc extends PApplet{
    public void settings(){
fullScreen();

    }

    public void setup(){

    }


    public void draw(){


      for(int i = 0; i<30; i++){
        float x = random(0,width);
        float y = random(0,height);
        float sizex = random(10,50);
        float sizey = random(10,50);
        rect(x,y,sizex,sizey);
      }
    }


    public static void main(String[] args){
        PApplet.main("PracticeDoc");
    }
}
