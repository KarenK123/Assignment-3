package processing.test.gamesassign3;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import ddf.minim.signals.*; 
import ddf.minim.analysis.*; 
import ddf.minim.effects.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GamesAssign3 extends PApplet {





PFont font;
Minim minim;
AudioPlayer sou;
Minim minim1;
AudioPlayer sound;

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


public void setup(){
   // Load a soundfile from the /data folder of the sketch and play it back
  minim = new Minim(this);
  sou = minim.loadFile("sample.mp3");
  sou.loop();
  
  //loading font
  font = loadFont("snap40.vlw");
  textFont(font);
  
  
  //fullScreen();
  orientation(LANDSCAPE);
  background();
  
  
  float stageZone = (height*.75f);
  
  mysprite= new sprite((width/10), height-(height/7), width/15);
  //mycloud = new cloud(0, (width/12.5), 0.1);
  mytree = new tree(0);
  myflowers = new flowers(0, stageZone);
  mybird = new bird(0, (height/5), (width/130), (width/20));
  mybird1 = new bird((width/2), (height/15), (width/160), (width/20));
  mybird2 = new bird2((width/2), (height/7.5f), (width/160), (width/20), 100);
  mybird21 = new bird2(0, (height/15), (width/130), (width/20), 200);
  //float _xcent, float _ycent, float _speed, float _wbird
  mybird3 = new bird3(random(0, width), 0, (width/190), (width/20), 200);
  mybird32 = new bird3(random(0, width), 0, (width/150), (width/20), 200);
  mybird33 = new bird3(random(0, width), 0, (width/170), (width/20), 200);
  mybird34 = new bird3(random(0, width), 0, (width/210), (width/20), 200);
  mysprite2= new sprite2((width/2), height/1.2f, (width/22.5f));
  mycar = new car(width/1.2f, (height/3), (width/6));//red
  mycar3 = new car3(width/2, (height/5), (width/8), 100);//yellow
  mycar2 = new car2(width/5, (height/10), (width/10), (200));//green
  

}

int speed = 20;
int mode = 0;
int speeded = 2;
int speededS = 20;




public void keyPressed(){ // This function is called everytime a key is pressed.
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
class sprite{
  float startPosX;
  float startPosY;
  float wHead;
  
  //consrtuctor
  sprite(float _startPosX, float _startPosY, float _wHead){
    startPosX = _startPosX;
    startPosY = _startPosY;
    wHead = _wHead ;
  }
  
  
  public void display(){
    strokeWeight(1);
    //fill(255);
    stroke(255);
    /*
    //left leg and right leg
    line(startPosX, startPosY, startPosX+width/43.33, startPosY-(height/12));
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/26), startPosY);
    //body
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/43.33), startPosY-(height/4.2857));
    //head
    ellipse(startPosX+(width/43.33), startPosY-(height/3.75), (width/16.25) , (width/16.25));
    //left arm and right arm
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX, startPosY-(height/5));
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX+(width/21.6666), startPosY-(height/5));*/
    
    float wBody = width/10;
    //float wHead = width/15;
    float wEar = width/30;
    float wFeet = width/15;
    float hFeet = width/30;
    float wEyes = width/50;
    float hEyes = width/40;
    noStroke();
    fill(0xff9B9794);
    //feet
    ellipse(startPosX-(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    ellipse(startPosX+(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    //body
    ellipse(startPosX, startPosY, wBody, wBody);
    //arms
    //bezier(startPosX, startPosY-40, startPosX-70, startPosY, startPosX-50, startPosY, startPosX-30, startPosY+8 );
    //bezier(startPosX, startPosY-40, startPosX+70, startPosY, startPosX+50, startPosY, startPosX+30, startPosY+8 );
    //ears
    ellipse(startPosX-(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
    ellipse(startPosX+(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
    //head
    ellipse(startPosX, startPosY-wHead, wHead, wHead);
    //eyes
    fill(255);
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    fill(0);
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    //smile
    ellipse(startPosX, (startPosY-wHead)+(height/90), (width/65), (width/65));
    stroke(0);
    noFill();
    arc(startPosX-(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    arc(startPosX+(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    //belly
    noStroke();
    fill(225);
    ellipse(startPosX, startPosY, (wBody/1.4f), (wBody/1.3f));
  }
}
class tree{
  float trunk;
  
  
  tree(float _trunk){
    trunk = _trunk;
  }
  
  
  public void display(){
     float stageZone = (height*.75f);
 
     float upperZoneBark = ((height*.25f)+height/20);
  
    noFill();
    
    //tree trunks
    //noStroke();
    fill(0xff50463D);
    /*float trunkVer1 = (width/21.666);
    float trunkVer2 = (width/10.8333);
    float trunkVer3 = (width/5.909);
    float trunkVer4 = (width/8.125);
    
    for(float i = 10; i<6; i+= 200){
    bezier(trunkVer1+i,upperZoneBark,  trunkVer2+i,((stageZone+upperZoneBark)/2),  trunkVer2+i,((stageZone+upperZoneBark)/2),   trunkVer1+i,stageZone);
    bezier(trunkVer3+i,stageZone,   trunkVer4+i,((stageZone+upperZoneBark)/2),    trunkVer4+i,((stageZone+upperZoneBark)/2),     trunkVer3+i,upperZoneBark);
    }*/
    float trunkVer1 = (width/21.666f);
    float trunkVer2 = (width/8.8333f);
    float trunkVer3 = (width/5.909f);
    //float trunkVer4 = (width/8.125);
    for(float i=0; i<3500; i+=(width/4)){
    strokeWeight(10);
    stroke(0xff50463D);
    line(trunkVer1+i+(width/13),stageZone, trunkVer1+i+(width/13),upperZoneBark);
    }
    

    
    
    //treeBush
    noStroke();
    fill(0xff0A581C);
    for(float j=10; j<3500; j+= (width/4)){
    ellipse(trunkVer1+j, upperZoneBark, trunkVer2, trunkVer2);
    ellipse(trunkVer3+j, upperZoneBark, trunkVer2, trunkVer2);
    ellipse(trunkVer1+j, upperZoneBark-(height/6), trunkVer2, trunkVer2);
    ellipse(trunkVer3+j, upperZoneBark-(height/6), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25f), upperZoneBark+(height/30), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25f), upperZoneBark-(height/5), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25f), upperZoneBark-(height/10), trunkVer2, trunkVer2);
    
    }
  }
}
  
public void background(){
  
  float stageZone = (height*.75f);
  
  
  
 
  int r = 0;
  int g = 0;
  //int b; for blue
  
  for( int i=0; i < height; i++){
    stroke(r, g, i);
    line(0, i, width, i);
    noStroke();
}


//rect is stage
  fill(0xff4E7142);
  rect(0, stageZone, width, (height*.25f));

  
}
public void background2(){
  background(0);
  rectMode(CENTER);
  fill(255);
  noStroke();
  //noLoop();
  //float x=0;
  
  rectMode(CENTER);
  //line(0, (height/2), width, (height/2));
  for(float i=0; i<height; i+=40){
  //line(0, (height/2)+i, width, (height/2)+i);
  rect(width/2, 1+i, (width/10)+i, 15);
  }
 
}
//superclass bird

//create class
class bird{
  float xcent;
  float ycent;
  float speed;
  float wbird;
  
  //consrtuctor
  bird(float _xcent, float _ycent, float _speed, float _wbird){
    xcent = _xcent;
    ycent = _ycent;
    speed = _speed;
    wbird = _wbird;
  }
  
  //create function
  public void display(){
    
    
  //float wbird = (width/15);
  float hbird = (wbird/1.2f);
  //center to right side of bird
  float radius1 = (xcent+(wbird/2));
  //center to left side of bird
  float radius2 = (xcent-(wbird/2));
  //center to top of birds head
  float radiust = (ycent-(hbird/2));
  
  //body
  fill(105, 0, 105);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 146, 5);
  stroke(0);
  triangle(radius2, ycent, radius2+(wbird / 12), ycent-(wbird / 6), radius2-(wbird / 3), ycent);
  triangle(radius2, ycent, radius2+(wbird / 12), ycent+(wbird / 6), radius2-(wbird / 3), ycent);
 
  //eyes
  noStroke();
  fill(255);
  ellipse(xcent-(wbird / 4), ycent, (wbird / 4), (wbird / 4));
  fill(0);
  ellipse(xcent-(wbird / 4), ycent, (wbird / 8), (wbird / 8));
  
  
  //hair
  //cant put in for loop because of ellipse slope
  fill(255, 0, 0);
  triangle(xcent, radiust, xcent, radiust-(hbird / 4), xcent+(hbird / 4), radiust+(hbird / 24) );
  triangle(xcent-(hbird / 4), radiust+(hbird/18), xcent-(hbird / 4), radiust-(hbird / 4), xcent, radiust );
  triangle(xcent-(hbird / 2), radiust+(hbird / 5), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
  //wing
  fill(0, 255, 0);
  bezier(radius1, ycent+(wbird / 12), radius1+(wbird / 3), ycent-(wbird / 3), radius1+(wbird / 3), ycent-(wbird / 3), radius1-(wbird / 30), ycent-(wbird / 6));
  
  }
  
  public void move(){
  xcent = xcent - speed;
  if (xcent < 0){
    xcent = width;
  }
  }
}
//the second bird class, it is a subclass of the superclass bird

//create class
class bird2 extends bird{
  float colour;
  
  //consrtuctor
  bird2(float xcent, float ycent, float speed, float wbird, float _colour){
    super(xcent, ycent, speed, wbird);
    colour = _colour;
  }
  
  //create function
  public void display(){
    
  //float wbird = (width/15);
  float hbird = (wbird/1.2f);
  //center to right side of bird
  float radius1 = (xcent-(wbird/2));
  //center to left side of bird
  float radius2 = (xcent+(wbird/2));
  //center to top of birds head
  float radiust = (ycent-(hbird/2));
  
  //body
  fill(105, 105, 0);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 216, 5);
  stroke(0);
  triangle(radius2, ycent, radius2-(wbird / 12), ycent-(wbird / 6), radius2+(wbird / 3), ycent);
  triangle(radius2, ycent, radius2-(wbird / 12), ycent+(wbird / 6), radius2+(wbird / 3), ycent);
 
  //eyes
  noStroke();
  fill(255);
  ellipse(xcent+(wbird / 4), ycent, (wbird / 4), (wbird / 4));
  fill(0);
  ellipse(xcent+(wbird / 4), ycent, (wbird / 8), (wbird / 8));
  
  
  //hair
  //cant put in for loop because of ellipse slope
  fill(100, 0, 100);
  triangle(xcent, radiust, xcent, radiust-(hbird / 4), xcent+(hbird / 4), radiust+(hbird / 24) );
  triangle(xcent-(hbird / 4), radiust+(hbird/18), xcent-(hbird / 4), radiust-(hbird / 4), xcent, radiust );
  triangle(xcent-(hbird / 2), radiust+(hbird / 5), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
  //wing
  fill(255, 0, 0);
  bezier(radius1, ycent+(wbird / 12), radius1-(wbird / 3), ycent-(wbird / 3), radius1-(wbird / 3), ycent-(wbird / 3), radius1+(wbird / 30), ycent-(wbird / 6));
  
  }
  
  public void move(){
  xcent = xcent + speed;
  if (xcent > width){
    xcent = 0;
  }
  
  
  }
}
//the third bird class, it is a subclass of the superclass bird

//create class
class bird3 extends bird{
  float colour;
  
  //consrtuctor
  bird3(float xcent, float ycent, float speed, float wbird, float _colour){
    super(xcent, ycent, speed, wbird);
    colour = _colour;
  }
  
  //create function
  public void display(){
    
  //float wbird = (width/15);
  float hbird = (wbird/.9f);
  //center to right side of bird

  

  
  //body
  fill(100, 15, 150);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 216, 5);
  stroke(0);
  triangle(xcent-(width/86.66f), ycent+(hbird/2)-(height/120), xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(height/30));
  triangle(xcent+(width/86.66f), ycent+(hbird/2)-(height/120) , xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(height/30));
 
  //eyes
  noStroke();
  fill(255);
  ellipse(xcent, ycent+(hbird/4), (wbird / 4), (wbird / 4));
  fill(0);
  ellipse(xcent, ycent+(hbird/4), (wbird / 8), (wbird / 8));
  
  
  //hair
  //cant put in for loop because of ellipse slope
  fill(100, 100, 80);
  triangle(xcent-(wbird/2)+(width/150), ycent+(height/40), xcent-(wbird/2)-(width/65), ycent+(height/40), xcent-(wbird/2), ycent+(height/120));
  triangle(xcent-(wbird/2), ycent+(height/120), xcent-(wbird/2)-(width/65), ycent, xcent-(wbird/2)+(width/220), ycent-(height/60));
  triangle(xcent-(wbird/2)+(width/260), ycent-(height/60), xcent-(wbird/2)-(width/60), ycent-(height/50), xcent-(wbird/2)+(width/140), ycent-(height/30));
  
  
   
  //wing
  fill(255, 0, 255);
  bezier(xcent-(width/130), ycent-(hbird/2)+(height/150), 
  xcent-(width/65), ycent-(hbird/2)-(height/20), 
  xcent-(width/65), ycent-(hbird/2)-(height/20), 
  xcent+(width/130), ycent-(hbird/2)+(height/150));
  
  }
  
  public void move(){
   
  ycent = ycent + speed;
  if (ycent > height){
    ycent = 0;
  }
  }
  
  
}
class car{
  float xPos;
  float yPos;
  float cWidth;
  //float wheel1X;
  //float wheel2X;
  //float wheelY;

car(float _xPos, float _yPos, float _cWidth){
  xPos = _xPos;
  yPos = _yPos;
  cWidth = _cWidth;
  //wheel1X = _wheel1X;
  //wheel2X = _wheel2X;
  //wheelY = _wheelY;
}


public void display(){
  rectMode(CORNER);
  
  //car width and height
  //float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263f);
  float wheel1X = xPos+(cWidth/5);   
  float wheel2X = xPos+(cWidth/1.2f);
  float wheelY = yPos+(cHeight);
  
  fill(255, 0, 0);
  stroke(255,  0, 0);
  //exhaust
  rect(xPos+cWidth, yPos+(cHeight/1.5f), (cWidth/11.66f), (cWidth/17.5f));
  //body 
  rect(xPos, yPos, cWidth, cHeight);
  fill(0);
  stroke(255);
  //wheels
  ellipse(wheel1X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  ellipse(wheel2X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  fill(255);
  ellipse(wheel1X, wheelY, (cWidth/7), (cWidth/7));
  ellipse(wheel2X, wheelY, (cWidth/7), (cWidth/7));
  fill(0);
  ellipse(wheel1X, wheelY, (cWidth/8.75f), (cWidth/8.75f));
  ellipse(wheel2X, wheelY, (cWidth/8.75f), (cWidth/8.75f));;
  fill(255, 0, 0);
  stroke(255, 0, 0);
  //hood
  bezier(xPos+(cWidth/8), yPos, 
  xPos+(cWidth/8), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos);
  //window
  fill(0);
  arc(xPos+(cWidth/1.8f), yPos, (cWidth/1.4f), (cHeight/.6f), -PI, 0, CHORD);
  
  
}

public void move(){
  xPos = xPos - speeded;
  if (xPos < 0){
    xPos = width;
    
  }
}


}
class car2 extends car{
    float colour;
    
car2(float xPos, float yPos, float cWidth, float _colour){
  super(xPos, yPos, cWidth);
  colour = _colour;
}


  public void display(){
  rectMode(CORNER);
  
  //car width and height
  //float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263f);
  float wheel1X = xPos+(cWidth/5);   
  float wheel2X = xPos+(cWidth/1.2f);
  float wheelY = yPos+(cHeight);
  
  fill(0xff49A55B);
  stroke(0xff49A55B);
  //exhaust
  rect(xPos+cWidth, yPos+(cHeight/1.5f), (cWidth/11.66f), (cWidth/17.5f));
  //body 
  rect(xPos, yPos, cWidth, cHeight);
  fill(0);
  stroke(255);
  //wheels
  ellipse(wheel1X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  ellipse(wheel2X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  fill(255);
  ellipse(wheel1X, wheelY, (cWidth/7), (cWidth/7));
  ellipse(wheel2X, wheelY, (cWidth/7), (cWidth/7));
  fill(0);
  ellipse(wheel1X, wheelY, (cWidth/8.75f), (cWidth/8.75f));
  ellipse(wheel2X, wheelY, (cWidth/8.75f), (cWidth/8.75f));;
  fill(0xff49A55B);
  stroke(0xff49A55B);
  //hood
  bezier(xPos+(cWidth/8), yPos, 
  xPos+(cWidth/8), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos);
  //window
  fill(0);
  arc(xPos+(cWidth/1.8f), yPos, (cWidth/1.4f), (cHeight/.6f), -PI, 0, CHORD);
  
  
}
}
class car3 extends car{
    float colour;
    
car3(float xPos, float yPos, float cWidth, float _colour){
  super(xPos, yPos, cWidth);
  colour = _colour;
}


  public void display(){
  rectMode(CORNER);
  
  //car width and height
  //float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263f);
  float wheel1X = xPos+(cWidth/5);   
  float wheel2X = xPos+(cWidth/1.2f);
  float wheelY = yPos+(cHeight);
  
  fill(0xffF2EC1B);
  stroke(0xffF2EC1B);
  //exhaust
  rect(xPos+cWidth, yPos+(cHeight/1.5f), (cWidth/11.66f), (cWidth/17.5f));
  //body 
  rect(xPos, yPos, cWidth, cHeight);
  fill(0);
  stroke(255);
  //wheels
  ellipse(wheel1X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  ellipse(wheel2X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
  fill(255);
  ellipse(wheel1X, wheelY, (cWidth/7), (cWidth/7));
  ellipse(wheel2X, wheelY, (cWidth/7), (cWidth/7));
  fill(0);
  ellipse(wheel1X, wheelY, (cWidth/8.75f), (cWidth/8.75f));
  ellipse(wheel2X, wheelY, (cWidth/8.75f), (cWidth/8.75f));;
  fill(0xffF2EC1B); //polymorphism
  stroke(0xffF2EC1B);
  //hood
  bezier(xPos+(cWidth/8), yPos, 
  xPos+(cWidth/8), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos-(cHeight*1.5f), 
  xPos+(cWidth), yPos);
  //window
  fill(0);
  arc(xPos+(cWidth/1.8f), yPos, (cWidth/1.4f), (cHeight/.6f), -PI, 0, CHORD);
  
  
}
}
//clouds class

//creating class
class cloud{
  //x and y are coordinates of where the clouds start
 float x;
 float y;
 float speed;
 
 //constructor
 cloud(float _x, float _y, float _speed){
   x = _x;
   y = _y;;
   speed = _speed;
   
 }
 
 //creating function
 public void display(){
 noStroke();
 fill(255);
 
 float zonez = (height/10);
 
 //the width and height of one of five circles that make a cloud
 float cloudw = (width/18);
 float cloudh = (zonez);
 
 //x0   y40
 //c is circle ie. c1, c2...c6 make a cloud
 float c1 = x+(cloudw*1.2f);
 float c2 = x+(cloudw*.6f);
 float c3 = y+(cloudw*.6f);
 float c5 = y+(cloudw*.7f);
 
 
 for(float c=0; c<=(width*3); c+=(width/3)){
 float cy=0;
 ellipse(x+c, y+cy, cloudw, cloudh);
 ellipse(c2+c, y+cy, cloudw, cloudh);
 ellipse(c1+c, y+cy, cloudw, cloudh);
 ellipse(x+c, c3+cy, cloudw, cloudh);
 ellipse(c2+c, c5+cy, cloudw, cloudh);
 ellipse(c1+c, c3+cy, cloudw, cloudh); 
 }
 
 
  for(float c=(width/6); c<=(width*3); c+=(width/3)){
   for(float cy2=20; cy2<=20; cy2+=20) {
     ellipse(x+c, y+cy2, cloudw, cloudh);
     ellipse(c2+c, y+cy2, cloudw, cloudh);
     ellipse(c1+c, y+cy2, cloudw, cloudh);
     ellipse(x+c, c3+cy2, cloudw, cloudh);
     ellipse(c2+c, c5+cy2, cloudw, cloudh);
     ellipse(c1+c, c3+cy2, cloudw, cloudh); 
   }
 }
 
}  


public void move(){
  x = x - speed;
  if (x < -(width*width)){
    x = width;      
  }
}

}
 
public void draw(){
  switch(mode){
    
      case 0: {
      background();
      homepage();
      }
      break;
      
      
      
      
      case 1: {
          
        background();
        mytree.display();
        myflowers.display();
        mysprite.display();
        mybird.display();
        mybird.move();
        mybird1.display();
        mybird1.move();
        mybird2.display();
        mybird2.move();
        mybird21.display();
        mybird21.move();
        mybird3.display();
        mybird3.move();
        
        fill(0xffF773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(0xffFAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(0xffFAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
    break;
    
    
    
    
    
    case 2:{
    background();
        mytree.display();
        myflowers.display();
        mysprite.display();
        mybird.display();
        mybird.move();
        mybird1.display();
        mybird1.move();
        mybird2.display();
        mybird2.move();
        mybird21.display();
        mybird21.move();
        mybird3.display();
        mybird3.move();
        mybird32.display();
        mybird32.move();
        
        fill(0xffF773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(0xffFAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wHead + mybird32.wbird/2 ){
        lose();
      }
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(0xffFAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
      break;
      
      
      
      
      
      case 3:{
    background();
        mytree.display();
        myflowers.display();
        mysprite.display();
        mybird.display();
        mybird.move();
        mybird1.display();
        mybird1.move();
        mybird2.display();
        mybird2.move();
        mybird21.display();
        mybird21.move();
        mybird3.display();
        mybird3.move();
        mybird32.display();
        mybird32.move();
        mybird33.display();
        mybird33.move();
        
        fill(0xffF773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(0xffFAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wHead + mybird32.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird33.xcent, mybird33.ycent) < mysprite.wHead + mybird33.wbird/2 ){
        lose();
      }
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(0xffFAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
      break;
      
      
      
      case 4:
    {
          
          
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    
    
    
    
    
    case 5:
    {
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      mycar2.display();
      mycar2.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar2.xPos, mycar2.yPos) < mysprite2.wHead + mycar2.cWidth/2 ){
        lose();
      }
      
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    
    
    
    
    
    case 6:
    {
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      mycar2.display();
      mycar2.move();
      mycar3.display();
      mycar3.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar2.xPos, mycar2.yPos) < mysprite2.wHead + mycar2.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar3.xPos, mycar3.yPos) < mysprite2.wHead + mycar3.cWidth/2 ){
        lose();
      }
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    default:
    {
      background();
    }
    break;
    
    
  }//end switch
   
   
}//end draw
class flowers{
  float x;
  float y;
  
  
  flowers(float _x, float _y){
    x=_x;
    y=_y;
  }
  
  
  public void display(){
  noStroke();
  for(float i=0; i<width; i+=(width/50)){
  fill(0xffFA8BD1);
  ellipse(x+i, y, (width/100), (width/100));
  ellipse(x+i+(width/200), y+(width/200), (width/100), (width/100));
  ellipse(x+i+(width/100), y, (width/100), (width/100));
  ellipse(x+i+(width/200), y-(width/200), (width/100), (width/100));
  fill(0xffFAE205);
  ellipse(x+i+(width/200), y, (width/200), (width/200));
  }
  }
}
public void homepage(){
  
  
  String lines[] = loadStrings("Welcome.txt");
  for (int i = 0; i < lines.length; i++) {
     fill(0xffFAA803);
    text(lines[i], (width/6), (height/10), (width/1.4f), (height/1.2f));  // Text wraps within text box
  }
  
  
}
int score = 50;

public void lose(){
  println("noooo");
    score--;
    println(score);
    text("Lives:" +score, width-150, 20);
    //output.println("Score:" +score);
}

public void win(){
   println("yessssss");
    score++;
    println(score);
    text("Lives:" +score, width-150, 20);
    //output.println("Score:" +score);
}
class sprite2{
  float startPosX;
  float startPosY;
  float wHead;
  
  //consrtuctor
  sprite2(float _startPosX, float _startPosY, float _wHead){
    startPosX = _startPosX;
    startPosY = _startPosY;
    wHead = _wHead;
  }
  
  
  public void display(){
    strokeWeight(1);
    //fill(255);
    stroke(255);
    
    float wBody = width/15;
    //float wHead = width/22.5;
    float wEar = width/45;
    float wFeet = width/22.5f;
    float hFeet = width/45;
    float wEyes = width/75;
    float hEyes = width/60;
    
    
    noStroke();
    fill(0xff9B9794);
    //feet
    ellipse(startPosX-(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    ellipse(startPosX+(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    //body
    ellipse(startPosX, startPosY, wBody, wBody);
    //arms
    //bezier(startPosX, startPosY-40, startPosX-70, startPosY, startPosX-50, startPosY, startPosX-30, startPosY+8 );
    //bezier(startPosX, startPosY-40, startPosX+70, startPosY, startPosX+50, startPosY, startPosX+30, startPosY+8 );
    //ears
    ellipse(startPosX-(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
    ellipse(startPosX+(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
    //head
    ellipse(startPosX, startPosY-wHead, wHead, wHead);
    //eyes
    fill(255);
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    fill(0);
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    //smile
    ellipse(startPosX, (startPosY-wHead)+(height/90), (width/65), (width/65));
    stroke(0);
    noFill();
    arc(startPosX-(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    arc(startPosX+(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    //belly
    noStroke();
    fill(225);
    ellipse(startPosX, startPosY, (wBody/1.4f), (wBody/1.3f));
  }



}
  public void settings() {  size(650, 300);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GamesAssign3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
