import processing.core.PApplet;

public class bird3 extends bird {
	
	float colour;
	  
	  //consrtuctor
	bird3(PApplet parent, float xcent, float ycent, float speed, float wbird, float _colour){
	    super(parent, xcent, ycent, speed, wbird);
	    colour = _colour;
	  }
	  
	  //create function
	  public void display(){
	    
	  //float wbird = (width/15);
	  float hbird = (wbird/.9f);
	  //center to right side of bird

	  

	  
	  //body
	  parent.fill(100, 15, 150);
	  parent.ellipse(xcent, ycent, wbird, (float) hbird);
	  
	  //beak
	  parent.fill(252, 216, 5);
	  parent.stroke(0);
	  parent.triangle(xcent-(parent.width/86.66f), ycent+(hbird/2)-(parent.height/120), xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(parent.height/30));
	  parent.triangle(xcent+(parent.width/86.66f), ycent+(hbird/2)-(parent.height/120) , xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(parent.height/30));
	 
	  //eyes
	  parent.noStroke();
	  parent.fill(255);
	  parent.ellipse(xcent, (float) (ycent+(hbird/4)), (wbird / 4), (wbird / 4));
	  parent.fill(0);
	  parent.ellipse(xcent, (float) (ycent+(hbird/4)), (wbird / 8), (wbird / 8));
	  
	  
	  //hair
	  //cant put in for loop because of ellipse slope
	  parent.fill(100, 100, 80);
	  parent.triangle(xcent-(wbird/2)+(parent.width/150), ycent+(parent.height/40), xcent-(wbird/2)-(parent.width/65), ycent+(parent.height/40), xcent-(wbird/2), ycent+(parent.height/120));
	  parent.triangle(xcent-(wbird/2), ycent+(parent.height/120), xcent-(wbird/2)-(parent.width/65), ycent, xcent-(wbird/2)+(parent.width/220), ycent-(parent.height/60));
	  parent.triangle(xcent-(wbird/2)+(parent.width/260), ycent-(parent.height/60), xcent-(wbird/2)-(parent.width/60), ycent-(parent.height/50), xcent-(wbird/2)+(parent.width/140), ycent-(parent.height/30));
	  
	  
	   
	  //wing
	  parent.fill(255, 0, 255);
	  parent.bezier(xcent-(parent.width/130), ycent-(hbird/2)+(parent.height/150), 
	  xcent-(parent.width/65), ycent-(hbird/2)-(parent.height/20), 
	  xcent-(parent.width/65), ycent-(hbird/2)-(parent.height/20), 
	  xcent+(parent.width/130), ycent-(hbird/2)+(parent.height/150));
	  
	  }
	  
	  public void move(){
	   
	  ycent = ycent + speed;
	  if (ycent > parent.height){
	    ycent = 0;
	  }
	  }
	  
}
