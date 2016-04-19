sprite mysprite;

void setup(){
  background(0);
  size(650, 300);
  //fullScreen();
  orientation(LANDSCAPE);
  background();
  smooth();
  mysprite= new sprite((width/2), height/1.2);
  float stageZone = (height*.75);
  float upperZone = (height*.25);
}


void draw(){
  mysprite.display();
  
  
}