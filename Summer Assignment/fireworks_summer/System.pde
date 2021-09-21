class System {
  ArrayList<Particle> particles;
  PVector position;
  color f;

  System(int x, int y) {
    //initialize particle arraylist
    particles = new ArrayList<Particle>();
    position = new PVector(x, y);
    f = color(random(255), random(255), random(255));
    //populate the arraylist with particles using a for loop
    for ( int i = 0; i <100; i++){
      PVector p = PVector.random2D();
      p.mult(random(.5,1.3));
      Particle particle = new Particle(position, p, f);
      particles.add(particle);
    }      
  }

  void everything() {
    //remove dead particles
    for (int i = particles.size()-1; i < -1; i--) {
      Particle p = particles.get(i);
      if (p.isDead()) {
        particles.remove(p);
      }
    }

    for (Particle p : particles) {  
      p.update();
      p.display();
    }
  }
}
