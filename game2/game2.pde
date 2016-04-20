PFont font;
import ddf.minim.*;
import ddf.minim.signals.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
Minim minim1;
AudioPlayer sound;

sprite2 mysprite2;
car mycar;
car2 mycar2;
car3 mycar3;

void setup(){
  // Load a soundndfile from the /data folder of the sketch and play it back
  minim1 = new Minim(this);
  sound = minim1.loadFile("sample.mp3");
  sound.loop();
  
  //loading font
  font = loadFont("snap40.vlw");
  textFont(font);
  
  
  //size(650, 300);
  fullScreen();
  orientation(LANDSCAPE);
  smooth();
  mysprite2= new sprite2((width/2), height/1.2, (width/22.5));
  mycar = new car(width/1.2, (height/3), (width/6));//red
  mycar3 = new car3(width/2, (height/5), (width/8), 100);//yellow
  mycar2 = new car2(width/5, (height/10), (width/10), (200));//green
  
  float stageZone = (height*.75);
  float upperZone = (height*.25);
  
  
}

int speeded = 2;
int speededS = 20;
int mode = 0;




void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == UP)
    {
      mysprite2.startPosY-=speededS;
    }
    else if (keyCode == DOWN)
    {
      mysprite2.startPosY+=speededS;
    }
  } 
  if (key >= '0' && key <='9')
  {
    mode = key - '0';
  }
} // End of keyPressed()