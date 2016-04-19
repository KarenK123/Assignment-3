sprite mysprite;
car mycar;
car mycar2;
car mycar3;

void setup(){
  size(650, 300);
  //fullScreen();
  orientation(LANDSCAPE);
  smooth();
  mysprite= new sprite((width/2), height/1.2);
  mycar = new car(500, 50);
  mycar2 = new car(250, 150);
  mycar3 = new car(100, 250);
  float stageZone = (height*.75);
  float upperZone = (height*.25);
  
}

int speed = 3;


void draw(){
  background(0);
  background();
  mysprite.display();
  mycar.display();
  mycar.move();
  mycar2.display();
  mycar2.move();
  mycar3.display();
  mycar3.move();
  
}