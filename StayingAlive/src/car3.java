import processing.core.PApplet;
import processing.core.PConstants;

public class car3 extends car {
	
	
	float colour;
    
	car3(PApplet parent, float xPos, float yPos, float cWidth, float _colour){
	  super(parent, xPos, yPos, cWidth);
	  colour = _colour;
	}


	  public void display(){
	  
      parent.rectMode(PConstants.CORNER);
	  //car width and height
	  //float cWidth = (width/6);//175
	  float cHeight = (cWidth/7.36842105263f);
	  float wheel1X = xPos+(cWidth/5);   
	  float wheel2X = xPos+(cWidth/1.2f);
	  float wheelY = yPos+(cHeight);
	  
	  parent.fill(240, 233, 29);
	  parent.stroke(240, 233, 29);
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
	  parent.ellipse(wheel1X, wheelY, (cWidth/7f), (cWidth/7f));
	  parent.ellipse(wheel2X, wheelY, (cWidth/7f), (cWidth/7f));
	  parent.fill(0);
	  parent.ellipse(wheel1X, wheelY, (cWidth/8.75f), (cWidth/8.75f));
	  parent.ellipse(wheel2X, wheelY, (cWidth/8.75f), (cWidth/8.75f));;
	  parent.fill(240, 233, 29); //polymorphism
	  parent.stroke(240, 233, 29);
	  //hood
	  parent.bezier(xPos+(cWidth/8), yPos, 
	  xPos+(cWidth/8), yPos-(cHeight*1.5f), 
	  xPos+(cWidth), yPos-(cHeight*1.5f), 
	  xPos+(cWidth), yPos);
	  //window
	  parent.fill(0);
	parent.arc(xPos+(cWidth/1.8f), yPos, (cWidth/1.4f), (cHeight/.6f), -(PConstants.PI) , 0, PConstants.OPEN);
	  
	  
	}
	
	

}
