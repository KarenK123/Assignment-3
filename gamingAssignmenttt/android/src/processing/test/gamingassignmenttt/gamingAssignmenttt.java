package processing.test.gamingassignmenttt;

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

public class gamingAssignmenttt extends PApplet {

sprite mysprite;
tree mytree;


public void setup(){
  
  mysprite= new sprite(0,height);
  mytree = new tree(0);
  
  float stageZone = (height*.75f);
  float upperZone = (height*.25f);

}



public void draw(){
  background();
  mysprite.display();
  mytree.display();
  
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
    fill(255);
    stroke(255);
    //left leg and right leg
    line(startPosX, startPosY, startPosX+width/43.33f, startPosY-(height/12));
    line(startPosX+(width/43.33f), startPosY-(height/12), startPosX+(width/26), startPosY);
    //body
    line(startPosX+(width/43.33f), startPosY-(height/12), startPosX+(width/43.33f), startPosY-(height/4.2857f));
    //head
    ellipse(startPosX+(width/43.33f), startPosY-(height/3.75f), (width/16.25f) , (width/16.25f));
    //left arm and right arm
    line(startPosX+(width/43.33f), startPosY-(height/7.5f), startPosX, startPosY-(height/5));
    line(startPosX+(width/43.33f), startPosY-(height/7.5f), startPosX+(width/21.6666f), startPosY-(height/5));
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
    noStroke();
    fill(0xff50463D);
    float trunkVer1 = (width/21.666f);
    float trunkVer2 = (width/10.8333f);
    float trunkVer3 = (width/5.909f);
    float trunkVer4 = (width/8.125f);
    
    for(float i = 10; i<3500; i+= 160){
    bezier(trunkVer1+i,upperZoneBark,  trunkVer2+i,((stageZone+upperZoneBark)/2),  trunkVer2+i,((stageZone+upperZoneBark)/2),   trunkVer1+i,stageZone);
    bezier(trunkVer3+i,stageZone,   trunkVer4+i,((stageZone+upperZoneBark)/2),    trunkVer4+i,((stageZone+upperZoneBark)/2),     trunkVer3+i,upperZoneBark);
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
  
  //rect is stage
  rect(0, stageZone, width, (height*.25f));
  
  
}
  public void settings() {  size(650, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "gamingAssignmenttt" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
