sprite mysprite;
car mycar;
car mycar2;
car mycar3;

void setup(){
  size(650, 300);
  //fullScreen();
  orientation(LANDSCAPE);
  smooth();
  mysprite= new sprite((width/2), height/1.2, (width/15));
  mycar = new car(width/1.2, (height/1.2), (width/6));
  mycar2 = new car(width/5, (height/5), (width/6));
  mycar3 = new car(width/2, (height/2), (width/6));
  float stageZone = (height*.75);
  float upperZone = (height*.25);
  
}

int speed = 2;
int speedS = 20;


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
  
  if(mysprite.startPosY < 0){
  noLoop();
  }
  
  if(dist( mysprite.startPosX, mysprite.startPosY, mycar.cWidth/2, mycar.cWidth/2) < mysprite.wHead + mycar.cWidth ){
    lose();
  }
  
  if(score < -50){
  noLoop();
  }
  
  
}


void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == UP)
    {
      mysprite.startPosY-=speedS;
    }
    else if (keyCode == DOWN)
    {
      mysprite.startPosY+=speedS;
    }
  } 
} // End of keyPressed()