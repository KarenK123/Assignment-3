import processing.core.*;
import ddf.minim.*;

@SuppressWarnings("serial")
public class StayingAlive extends PApplet {

	static public void main(String[] args) {
		  PApplet.main("StayingAlive");
		}
	
	
	Minim minim;
	AudioPlayer sou;
	
	PFont font;
	int speed = 20;
	int mode = 0;
	int speeded = 2;
	int speededS = 20;
	
	
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
	
	
    public void setup() {
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
    	  
    	  float stageZone = (height*.75f);
    	  
    	  mysprite= new sprite(this, (width/10f), height-(height/7), width/15);
    	  //mycloud = new cloud(0, (width/12.5), 0.1);
    	  mytree = new tree(this, 0);
    	  myflowers = new flowers(this, 0, stageZone);
    	  mybird = new bird(this, 0, (height/5), (width/130), (width/20));
    	  mybird1 = new bird(this, (width/2), (height/15), (width/160), (width/20));
    	  mybird2 = new bird2(this, (width/2), (height/7.5f), (width/160), (width/20), 100);
    	  mybird21 = new bird2(this, 0, (height/15), (width/130), (width/20), 200);
    	  //float _xcent, float _ycent, float _speed, float _wbird
    	  mybird3 = new bird3(this, random(0, width), 0, (width/190), (width/20), 200);
    	  mybird32 = new bird3(this, random(0, width), 0, (width/150), (width/20), 200);
    	  mybird33 = new bird3(this, random(0, width), 0, (width/170), (width/20), 200);
    	  mybird34 = new bird3(this, random(0, width), 0, (width/210), (width/20), 200);
    	  mysprite2= new sprite2(this, (width/2f), height/1.2f, (width/22.5f));
    	  mycar = new car(this, width/1.2f, (height/3), (width/6));//red
    	  mycar3 = new car3(this, width/2, (height/5), (width/8), 100);//yellow
    	  mycar2 = new car2(this, width/5, (height/10), (width/10), (200));//green

        
}

    public void draw() {
    	
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
          
          fill(247, 115, 232);
          text("Lives:" +score/10, width-150, 20);
        
          if(mysprite.startPosX > width){
          String lines[] = loadStrings("Win.txt");
              for (int i = 0; i < lines.length; i++) {
                 fill(250, 168, 3);
                 text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
              }
          noLoop();
          }
        
        if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < (mysprite.wHead + mybird3.wbird/2) ){
          lose();
        }
        
        
        if(score < 0){
          String lines[] = loadStrings("Lose.txt");
              for (int i = 0; i < lines.length; i++) {
                fill(250, 168, 3);
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
          
          fill(247, 115, 232);
          text("Lives:" +score/10, width-150, 20);
        
          if(mysprite.startPosX > width){
          String lines[] = loadStrings("Win.txt");
              for (int i = 0; i < lines.length; i++) {
                 fill(250, 168, 3);
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
                fill(250, 168, 3);
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
          
          fill(247, 115, 232);
          text("Lives:" +score/10, width-150, 20);
        
          if(mysprite.startPosX > width){
          String lines[] = loadStrings("Win.txt");
              for (int i = 0; i < lines.length; i++) {
                 fill(250, 168, 3);
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
                fill(250, 168, 3);
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
        	String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(250, 168, 3);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
        
        if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
          lose();
        }
        
        
        if(score < 0){
        	String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(250, 168, 3);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
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
        	String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(250, 168, 3);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
        
        if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
          lose();
        }
        
        if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar2.xPos, mycar2.yPos) < mysprite2.wHead + mycar2.cWidth/2 ){
          lose();
        }
        
        
        if(score < 0){
        	String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(250, 168, 3);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
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
        	String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(250, 168, 3);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
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
        	String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(250, 168, 3);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
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
    	  fill(78, 113, 66);
    	  rect(0, stageZone, width, (float)(height*.25));

    	  
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
    
    public void homepage(){
    	  
    	  
    	  String lines[] = loadStrings("Welcome.txt");
    	  for (int i = 0; i < lines.length; i++) {
    		  fill(250, 168, 3);
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
    
    
    
	
	
    
}