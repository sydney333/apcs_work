//fireworks!
//refer back to old material; fireworks project; class project

Particle p;
System ps;
ArrayList<System> systems;

//setup
void setup() {
  //screensize
  fullScreen();
  //initialize arraylist and system
  systems = new ArrayList<System>();
  ps = new System(width/2,height/2);
  //add system to system 
  systems.add(ps);
}

//draw
void draw() {
  //set background
  background(255);
  //run system function
  ps.everything();
  for (System system : systems){
    system.everything();
  }
}

//mouseclick
void mouseClicked() {
  //input system of particles every click
  System newSystem = new System(int(random(1000)),int(random(1200)));
  systems.add(newSystem);
}
