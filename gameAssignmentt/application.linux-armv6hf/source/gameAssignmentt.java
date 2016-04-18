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

public class gameAssignmentt extends PApplet {

sprite mysprite;
tree mytree;

public void setup(){
  
  mysprite= new sprite(0,height);
  mytree = new tree(0);
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
    //bezier(30, 400,     80, 5,      80, 75,      30, 75);
    
  }
  
}
  
public void background(){
  fill(255, 0, 0);
  //rect is stage
  rect(0, (height*.75f), width, (height*.25f));
  
  
}
  public void settings() {  size(650, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "gameAssignmentt" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
