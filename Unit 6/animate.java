import processing.core.*;

public class animate extends PApplet{

    private float x;
    private float y;
    private float vx;
    private float vy;

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        x = random(0, height);
        y = random(0, height);
        vx = random(-10,10);
        vy = random(-10,10);


    }

    public void draw(){
        background(0);

          ellipse(x, y, 100,100);
          x += vx;
          y += vy;

          if (x > width - 50 || x < 50){
            vx *= -1;
            fill(random(255),random(255),random(255));
          }

          if(y>width-50 || y<50){
            vy *= -1;
            fill(random(255),random(255),random(255));
          }


    }

    public static void main(String[] args){
        PApplet.main("animate");
    }
}
