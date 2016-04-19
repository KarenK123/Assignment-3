package processing.test.assigngame;

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

public class AssignGame extends PApplet {

sprite mysprite;
tree mytree;
bird mybird;
bird mybird1;
bird2 mybird2;
bird2 mybird21;

public void setup(){
  
  background();
  
  mysprite= new sprite(height-(height/7));
  mytree = new tree(0);
  mybird = new bird(10, 20, 5, 30);
  mybird1 = new bird(100, 60, 4, 30);
  mybird2 = new bird2(100, 40, 4, 30, 100);
  mybird21 = new bird2(10, 80, 5, 30, 200);
  
  float stageZone = (height*.75f);
  float upperZone = (height*.25f);

}

float startPosX = (width/10);
int speed = 20;



public void draw(){
  background();
  mytree.display();
  mysprite.display();
  mybird.display();
  mybird.move();
  mybird1.display();
  mybird1.move();
  mybird2.display();
  mybird2.move();
  mybird21.display();
  mybird21.move();
  
}



public void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == LEFT)
    {
      startPosX-=speed;
    }
    else if (keyCode == RIGHT)
    {
      startPosX+=speed;
    }
  } 
} // End of keyPressed()
class sprite{
  float startPosY;
  
  //consrtuctor
  sprite(float _startPosY){
    startPosY = _startPosY;
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
    ellipse(startPosX-10, (startPosY-wHead)-5, wEyes, hEyes);
    ellipse(startPosX+10, (startPosY-wHead)-5, wEyes, hEyes);
    fill(0);
    ellipse(startPosX-10, (startPosY-wHead)-5, (wEyes/2), (hEyes/2));
    ellipse(startPosX+10, (startPosY-wHead)-5, (wEyes/2), (hEyes/2));
    //smile
    ellipse(startPosX, (startPosY-wHead)+5, 10, 10);
    stroke(0);
    noFill();
    arc(startPosX-6, (startPosY-wHead)+5, 10, 10, 0, PI, OPEN);
    arc(startPosX+6, (startPosY-wHead)+5, 10, 10, 0, PI, OPEN);
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
     float upperZone = (height*.25f);
     float upperZoneBark = ((height*.25f)+height/20);
  
    noFill();
    
    //tree trunks
    //noStroke();
    fill(0xff50463D);
    /*float trunkVer1 = (width/21.666);
    float trunkVer2 = (width/10.8333);
    float trunkVer3 = (width/5.909);
    float trunkVer4 = (width/8.125);
    
    for(float i = 10; i<3500; i+= 160){
    bezier(trunkVer1+i,upperZoneBark,  trunkVer2+i,((stageZone+upperZoneBark)/2),  trunkVer2+i,((stageZone+upperZoneBark)/2),   trunkVer1+i,stageZone);
    bezier(trunkVer3+i,stageZone,   trunkVer4+i,((stageZone+upperZoneBark)/2),    trunkVer4+i,((stageZone+upperZoneBark)/2),     trunkVer3+i,upperZoneBark);
    }*/
    float trunkVer1 = (width/21.666f);
    float trunkVer2 = (width/10.8333f);
    float trunkVer3 = (width/5.909f);
    //float trunkVer4 = (width/8.125);
    for(float i=0; i<3500; i+=160){
    strokeWeight(10);
    stroke(0xff50463D);
    line(trunkVer1+i+(width/13),stageZone, trunkVer1+i+(width/13),upperZoneBark);
    }
    

    
    
    //treeBush
    noStroke();
    fill(0xff0A581C);
    for(float j=10; j<3500; j+= 160){
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
  float upperZone = (height*.25f);
  
  
  
 
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
  float hbird = (height/12.5f);
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
  triangle(xcent-(hbird / 2), radiust+(hbird / 7), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
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
  triangle(xcent-(hbird / 2), radiust+(hbird / 7), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
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
  float hbird = (height/12.5f);
  //center to right side of bird
  float radius1 = (xcent+(wbird/2));
  //center to left side of bird
  float radius2 = (xcent-(wbird/2));
  //center to top of birds head
  float radiust = (ycent-(hbird/2));
  
  //body
  fill(100, 15, 150);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 216, 5);
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
  fill(100, 100, 80);
   triangle(xcent, radiust, xcent, radiust-(hbird / 4), xcent+(hbird / 4), radiust+(hbird / 24) );
  triangle(xcent-(hbird / 4), radiust+(hbird/18), xcent-(hbird / 4), radiust-(hbird / 4), xcent, radiust );
  triangle(xcent-(hbird / 2), radiust+(hbird / 7), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
  //wing
  fill(255, 0, 255);
  bezier(radius1, ycent+(wbird / 12), radius1+(wbird / 3), ycent-(wbird / 3), radius1+(wbird / 3), ycent-(wbird / 3), radius1-(wbird / 30), ycent-(wbird / 6));
  
  }
}
}
  public void settings() {  size(650, 300);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "AssignGame" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}