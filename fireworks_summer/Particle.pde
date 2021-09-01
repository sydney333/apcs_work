class Particle {
  //declare motion vectors
  PVector position, velocity, acceleration;
  //declare top speed and display size
  float topSpeed, radius, mass;
  float angleAcc, angleVel, angle;
  int lifeSpan;
  color s;

  //Constructor Function
  Particle(PVector pIn, PVector vIn, color f) {
    //assign initial values based on parameters passed into constructor
    position = new PVector(pIn.x, pIn.y);
    velocity = new PVector(vIn.x, vIn.y);
    acceleration = new PVector(0, 0);
    s = f;
    topSpeed = 5;
    radius = 2;
    mass = 1;
    lifeSpan = 255;
  }

  
  boolean isDead(){
    if(lifeSpan <0){
      return true;
    }else{
      return false;
    }
  }

  //applyForce Function
  void applyForce(PVector force) {
    //divide force by mover mass
    PVector f = PVector.div(force, mass);
    //add the resulting vector to acceleration
    acceleration.add(f);
  }


  void update() {
    lifeSpan-=3;
    
    angleAcc = acceleration.x/10;
    angleVel += angleAcc;
    angle+=angleVel;
    
    //add acceleration to velocity
    velocity.add(acceleration);
    //limit magnitude of velocity 
    velocity.limit(topSpeed);
    //add velocity to position
    position.add(velocity);
    //reset acceleration to zero
    acceleration.mult(0);
  }

  void display() {
    fill(s,lifeSpan);
    noStroke();
    pushMatrix();
    translate(position.x,position.y);
    rotate(angle);
    ellipse(0,0, radius*2, radius*2);
    popMatrix();
  }
}
