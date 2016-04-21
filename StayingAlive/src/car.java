import processing.core.PApplet;
import processing.core.PConstants;

public class car {

	
	PApplet parent;
		float xPos;
	  float yPos;
	  float cWidth;
	  //float wheel1X;
	  //float wheel2X;
	  //float wheelY;

	car(PApplet _parent, float _xPos, float _yPos, float _cWidth){
		parent = _parent;
	  xPos = _xPos;
	  yPos = _yPos;
	  cWidth = _cWidth;
	  //wheel1X = _wheel1X;
	  //wheel2X = _wheel2X;
	  //wheelY = _wheelY;
	}



	void display(){
	  parent.rectMode(PConstants.CORNER);
	  //car width and height
	  //float cWidth = (width/6);//175
	  float cHeight = (cWidth/7.36842105263f);
	  float wheel1X = xPos+(cWidth/5f);   
	  float wheel2X = xPos+(cWidth/1.2f);
	  float wheelY = yPos+(cHeight);
	  
	  parent.fill(255, 0, 0);
	  parent.stroke(255,  0, 0);
	  //exhaust
	  parent.rect(xPos+cWidth, yPos+(cHeight/1.5f), (cWidth/11.66f), (cWidth/17.5f));
	  //body 
	  parent.rect(xPos, yPos, cWidth, cHeight);
	  parent.fill(0);
	  parent.stroke(255);
	  //wheels
	  parent.ellipse(wheel1X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
	  parent.ellipse(wheel2X, wheelY, (cWidth/3.5f), (cWidth/3.5f));
	  parent.fill(255);
	  parent.ellipse(wheel1X, wheelY, (cWidth/7), (cWidth/7));
	  parent.ellipse(wheel2X, wheelY, (cWidth/7), (cWidth/7));
	  parent.fill(0);
	  parent.ellipse(wheel1X, wheelY, (cWidth/8.75f), (cWidth/8.75f));
	  parent.ellipse(wheel2X, wheelY, (cWidth/8.75f), (cWidth/8.75f));;
	  parent.fill(255, 0, 0);
	  parent.stroke(255, 0, 0);
	  //hood
	  parent.bezier(xPos+(cWidth/8), yPos, 
	  xPos+(cWidth/8), yPos-(cHeight*1.5f), 
	  xPos+(cWidth), yPos-(cHeight*1.5f), 
	  xPos+(cWidth), yPos);
	  //window
	  parent.fill(0);
	parent.arc(xPos+(cWidth/1.8f), yPos, (cWidth/1.4f), (cHeight/.6f), -(PConstants.PI) , 0, PConstants.OPEN);
	  
	  
	}

	void move(){
		float speeded = 2;
	  xPos = xPos - speeded;
	  if (xPos < 0){
	    xPos = parent.width;
	    
	  }
	}


	
}
