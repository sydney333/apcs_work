
import processing.core.*;
import java.util.*;
public class LostPage implements StateFunctions{

  public LostPage(PApplet p){

    this.p=p;
  }

  public void run(){
    p.background(155);
    p.textSize(50);
    p.fill(0);
    p.text("Sorry, you lost. Restart the game to try again!", p.width/2, p.height/2);
  }

  public void resetScore(){
    //levelOne.getScore();
    //int score=0;
  }

  public String state(){
    return "TWO";

  }

  public void keyPressed(){

  }

  private PApplet p;


}
