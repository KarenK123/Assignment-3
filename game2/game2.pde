PFont font;
import ddf.minim.*;
import ddf.minim.signals.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
Minim minim;
AudioPlayer sou;

sprite mysprite;
car mycar;
car2 mycar2;
car mycar3;

void setup(){
  // Load a soundfile from the /data folder of the sketch and play it back
  minim = new Minim(this);
  sou = minim.loadFile("sample.mp3");
  sou.loop();
  
  //loading font
  font = loadFont("snap40.vlw");
  textFont(font);
  
  
  //size(650, 300);
  fullScreen();
  orientation(LANDSCAPE);
  smooth();
  mysprite= new sprite((width/2), height/1.2, (width/22.5));
  mycar = new car(width/1.2, (height/3), (width/6));
  mycar2 = new car2(width/5, (height/10), (width/6), 200);
  mycar3 = new car(width/2, (height/5), (width/6));
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
  fill(255);
  text("score:" +score/10, width-150, 20);
  
  if(mysprite.startPosY < 0){
  noLoop();
  }
  
  if(dist( mysprite.startPosX, mysprite.startPosY, mycar.xPos, mycar.yPos) < mysprite.wHead + mycar.cWidth/2 ){
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