import processing.core.PApplet;
import processing.core.PConstants;

public class sprite2 {
		PApplet parent;
		float startPosX;
		float startPosY;
		float wHead;
	  
	  //consrtuctor
	  sprite2(PApplet _parent, float _startPosX, float _startPosY, float _wHead){
		parent = _parent;
	    startPosX = _startPosX;
	    startPosY = _startPosY;
	    wHead = _wHead;
	  }
	  
	  
	  public void display(){
	    parent.strokeWeight(1);
	    //fill(255);
	    parent.stroke(255);
	    
	    float wBody = parent.width/15;
	    //float wHead = width/22.5;
	    float wEar = parent.width/45;
	    float wFeet = parent.width/22.5f;
	    float hFeet = parent.width/45;
	    float wEyes = parent.width/75;
	    float hEyes = parent.width/60;
	    
	    
	    parent.noStroke();
	    parent.fill(155, 151, 148);
	    //feet
	    parent.ellipse(startPosX-(wFeet/2), startPosY+hFeet, wFeet, hFeet);
	    parent.ellipse(startPosX+(wFeet/2), startPosY+hFeet, wFeet, hFeet);
	    //body
	    parent.ellipse(startPosX, startPosY, wBody, wBody);
	    //arms
	    //bezier(startPosX, startPosY-40, startPosX-70, startPosY, startPosX-50, startPosY, startPosX-30, startPosY+8 );
	    //bezier(startPosX, startPosY-40, startPosX+70, startPosY, startPosX+50, startPosY, startPosX+30, startPosY+8 );
	    //ears
	    parent.ellipse(startPosX-(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
	    parent.ellipse(startPosX+(wEar/1.2f), (startPosY-wHead)-wEar, wEar, wEar);
	    //head
	    parent.ellipse(startPosX, startPosY-wHead, wHead, wHead);
	    //eyes
	    parent.fill(255);
	    parent.ellipse(startPosX-(parent.width/90), (startPosY-wHead)-(parent.height/70), wEyes, hEyes);
	    parent.ellipse(startPosX+(parent.width/90), (startPosY-wHead)-(parent.height/70), wEyes, hEyes);
	    parent.fill(0);
	    parent.ellipse(startPosX-(parent.width/90), (startPosY-wHead)-(parent.height/70), (wEyes/2), (hEyes/2));
	    parent.ellipse(startPosX+(parent.width/90), (startPosY-wHead)-(parent.height/70), (wEyes/2), (hEyes/2));
	    //smile
	    parent.ellipse(startPosX, (startPosY-wHead)+(parent.height/90), (parent.width/65), (parent.width/65));
	    parent.stroke(0);
	    parent.noFill();
	    parent.arc(startPosX-(parent.width/108f), (startPosY-wHead)+(parent.height/50f), (parent.width/100), (parent.width/70), 0, PConstants.PI, PConstants.OPEN);
	    parent.arc(startPosX+(parent.width/108f), (startPosY-wHead)+(parent.height/50f), (parent.width/100), (parent.width/70), 0, PConstants.PI, PConstants.OPEN);
	    //belly
	    parent.noStroke();
	    parent.fill(225);
	    parent.ellipse(startPosX, startPosY, (wBody/1.4f), (wBody/1.3f));
	  }



}
