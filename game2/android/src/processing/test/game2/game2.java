package processing.test.game2;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class game2 extends PApplet {

sprite mysprite;

public void setup(){
  background(0);
  
  //fullScreen();
  orientation(LANDSCAPE);
  background();
  
  mysprite= new sprite((width/2), height/1.2f);
  float stageZone = (height*.75f);
  float upperZone = (height*.25f);
}


public void draw(){
  mysprite.display();
  
  
}
public void background(){
  rectMode(CENTER);
  fill(255);
  //noLoop();
  /*float x=0;
  for(float i=0; i<=height; i+=20){
    for(float j=0; j<10; j+=10){
     rect((width/2), x+i, (width/4)+j, height/30); 
    }
  }*/
  
  rect((width/2), 0, (width/4), height/30);
  rect((width/2), 20, (width/4)+10, height/30);
  rect((width/2), 40, (width/4)+20, height/30);
  rect((width/2), 60, (width/4)+30, height/30);
  rect((width/2), 80, (width/4)+40, height/30);
  rect((width/2), 100, (width/4)+50, height/30);
  rect((width/2), 120, (width/4)+60, height/30);
  rect((width/2), 140, (width/4)+70, height/30);
  rect((width/2), 160, (width/4)+80, height/30);
  rect((width/2), 180, (width/4)+90, height/30);
  rect((width/2), 200, (width/4)+100, height/30);
  rect((width/2), 220, (width/4)+110, height/30);
  rect((width/2), 240, (width/4)+120, height/30);
  rect((width/2), 260, (width/4)+130, height/30);
  rect((width/2), 280, (width/4)+140, height/30);
  rect((width/2), 300, (width/4)+150, height/30);
}
class car{
  
  
  
}
class sprite{
  float startPosX;
  float startPosY;
  
  //consrtuctor
  sprite(float _startPosX, float _startPosY){
    startPosX = _startPosX;
    startPosY = _startPosY;
  }
  
  
  public void display(){
    strokeWeight(1);
    //fill(255);
    stroke(255);
    float wBody = width/10;
    float wHead = width/15;
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
  public void settings() {  size(650, 300);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "game2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
