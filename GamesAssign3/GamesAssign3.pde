PFont font;
import ddf.minim.*;
import ddf.minim.signals.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
Minim minim;
AudioPlayer sou;


sprite mysprite;
//cloud mycloud;
tree mytree;
flowers myflowers;
bird mybird;
bird mybird1;
bird2 mybird2;
bird2 mybird21;
bird3 mybird3;
bird3 mybird32;
bird3 mybird33;
bird3 mybird34;
sprite2 mysprite2;
car mycar;
car2 mycar2;
car3 mycar3;


void setup(){
  // Load a soundfile from the /data folder of the sketch and play it back
  minim = new Minim(this);
  sou = minim.loadFile("sample.mp3");
  sou.loop();
  
  //loading font
  font = loadFont("snap40.vlw");
  textFont(font);
  
  size(650, 300);
  //fullScreen();
  orientation(LANDSCAPE);
  background();
  smooth();
  
  float stageZone = (height*.75);
  
  mysprite= new sprite((width/10), height-(height/7), width/15);
  //mycloud = new cloud(0, (width/12.5), 0.1);
  mytree = new tree(0);
  myflowers = new flowers(0, stageZone);
  mybird = new bird(0, (height/5), (width/130), (width/20));
  mybird1 = new bird((width/2), (height/15), (width/160), (width/20));
  mybird2 = new bird2((width/2), (height/7.5), (width/160), (width/20), 100);
  mybird21 = new bird2(0, (height/15), (width/130), (width/20), 200);
  //float _xcent, float _ycent, float _speed, float _wbird
  mybird3 = new bird3(random(0, width), 0, (width/190), (width/20), 200);
  mybird32 = new bird3(random(0, width), 0, (width/150), (width/20), 200);
  mybird33 = new bird3(random(0, width), 0, (width/170), (width/20), 200);
  mybird34 = new bird3(random(0, width), 0, (width/210), (width/20), 200);
  mysprite2= new sprite2((width/2), height/1.2, (width/22.5));
  mycar = new car(width/1.2, (height/3), (width/6));//red
  mycar3 = new car3(width/2, (height/5), (width/8), 100);//yellow
  mycar2 = new car2(width/5, (height/10), (width/10), (200));//green
  

}

int speed = 20;
int mode = 0;
int speeded = 2;
int speededS = 20;




void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == LEFT)
    {
      mysprite.startPosX-=speed;
    }
    else if (keyCode == RIGHT)
    {
      mysprite.startPosX+=speed;
    }
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