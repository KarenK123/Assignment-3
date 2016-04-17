package processing.test.processingheeeelp;

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

public class processingHeeeelp extends PApplet {

public void setup(){
  
  
  background(255, 0, 0);
  fill(0, 255, 0);
}



public void draw(){
  ellipse(10, 10, 10, 10);
  ellipse(20, 20, 50, 50);
  
  
}
  public void settings() {  size(displayWidth, displayHeight, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "processingHeeeelp" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
