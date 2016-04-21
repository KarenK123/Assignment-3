import processing.core.PApplet;

public class bird {

	PApplet parent;
	float xcent;
	  float ycent;
	  float speed;
	  float wbird;
	  
	  //consrtuctor
	  bird(PApplet _parent, float _xcent, float _ycent, float _speed, float _wbird){
		parent = _parent;
	    xcent = _xcent;
	    ycent = _ycent;
	    speed = _speed;
	    wbird = _wbird;
	  }
	  
	  //create function
	  public void display(){
	    
	   
	  //float wbird = (width/15);
	  float hbird = ( wbird/1.2f);
	  //center to right side of bird
	  float radius1 = (xcent+(wbird/2));
	  //center to left side of bird
	  float radius2 = (xcent-(wbird/2));
	  //center to top of birds head
	  float radiust = (ycent-(hbird/2));
	  
	  //body
	  parent.fill(105, 0, 105);
	  parent.ellipse(xcent, ycent, wbird, hbird);
	  
	  //beak
	  parent.fill(252, 146, 5);
	  parent.stroke(0);
	  parent.triangle(radius2, ycent, radius2+(wbird / 12), ycent-(wbird / 6), radius2-(wbird / 3), ycent);
	  parent.triangle(radius2, ycent, radius2+(wbird / 12), ycent+(wbird / 6), radius2-(wbird / 3), ycent);
	 
	  //eyes
	  parent.noStroke();
	  parent.fill(255);
	  parent.ellipse(xcent-(wbird / 4), ycent, (wbird / 4), (wbird / 4));
	  parent.fill(0);
	  parent.ellipse(xcent-(wbird / 4), ycent, (wbird / 8), (wbird / 8));
	  
	  
	  //hair
	  //cant put in for loop because of ellipse slope
	  parent.fill(255, 0, 0);
	  parent.triangle(xcent, radiust, xcent, radiust-(hbird / 4), xcent+(hbird / 4), radiust+(hbird / 24) );
	  parent.triangle(xcent-(hbird / 4), radiust+(hbird/18), xcent-(hbird / 4), radiust-(hbird / 4), xcent, radiust );
	  parent.triangle(xcent-(hbird / 2), radiust+(hbird / 5), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
	  
	   
	  //wing
	  parent.fill(0, 255, 0);
	  parent.bezier(radius1, ycent+(wbird / 12), radius1+(wbird / 3), ycent-(wbird / 3), radius1+(wbird / 3), ycent-(wbird / 3), radius1-(wbird / 30), ycent-(wbird / 6));
	  
	  }
	  

	public void move(){
	  xcent = xcent - speed;
	  if (xcent < 0){
	    xcent =  parent.width;
	  }
	  }
}
