import processing.core.*;
import java.util.*;

public class BallClass{


public BallClass(PApplet p, PVector positionBall, PVector velocity){
  this.p = p;
  this.positionBall = positionBall.copy();
  this.velocity = velocity.copy();
  ballRadi = 25;

  lost = new LostPage(this.p);

}

  public void drawBall(){
    p.fill(0);
    positionBall.add(velocity);

    p.ellipse(positionBall.x,positionBall.y,ballRadi,ballRadi);
    //System.out.println("[" +positionBall.x + ", " + positionBall.y + "]");
  }

  public void checkWalls(){
      if (positionBall.x > p.width - 25/2 || positionBall.x < 25/2){
        velocity.x *= -1;
      }
      if(positionBall.y> p.height-25/2 || positionBall.y<25/2){
        velocity.y *= -1;
      }
  }

//change to hit top/bot way
  public boolean hitTarget(float ballposx, float ballposy, int ballradius, float avatarposx,
                                float avatarposy, int avatarwidth, int avatarheight){
    float d = p.dist(avatarposx, avatarposy, ballposx, ballposy);

    return(d<25);
  }

  public void checkAvatarBall(Avatar avatar){
    float avatarX = avatar.getPosX();
    float avatarY = avatar.getPosY();
    float avatarVelX = avatar.getVelX();
    float avatarVelY = avatar.getVelY();
    int avatarH = avatar.getH();
    int avatarW = avatar.getW();

    boolean hit = hitTarget(positionBall.x,positionBall.y,ballRadi,avatarX, avatarY, avatarW,avatarH);
    if(hit==true){
      velocity.y*=-1;
    }
  }

    public boolean hitGround(PVector positionBall){
      if(positionBall.y > p.height-25){
      //  System.out.println("ball below 25");
        return true;
      }
      return false;
    }

    public void checkGroundDie(){
      boolean grounded = hitGround(positionBall);
        if(grounded){
        //  System.out.println("boolean = true");
          velocity.y*=0;
          velocity.x*=0;
          current=2;
          lost.run();
          lost.resetScore();
      }
    }

    public PVector getBallPos(){
      return positionBall;
    }

    public void changeXVel(){
      velocity.x*=-1;
      velocity.x++;
      velocity.y*=1;
    }
    /*
    public void incrementxVel(){
      velocity.x+=0.5;
    }
    public void incrementyVel(){
      velocity.y+=0.5;
    }
    */

    public void changeYVel(){
      velocity.y*=-1;
      velocity.y++;
      velocity.x*=1;
    }

  private PApplet p;
  private PVector positionBall;
  private PVector velocity;
  private float avatarX;
  private float avatarY;
  private int avatarH;
  private int avatarW;
  private float avatarVelX;
  private float avatarVelY;
  private Avatar avatar;
  private int ballRadi;
  public int current;
  private LostPage lost;

  private float distance;
  private int radius;

}
