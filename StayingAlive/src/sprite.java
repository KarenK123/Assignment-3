import processing.core.PApplet;
import processing.core.PConstants;

public class sprite {
	PApplet parent;
	float startPosX;
	  float startPosY;
	  float wHead;
	  
	  //consrtuctor
	  sprite(PApplet _parent, float _startPosX, float _startPosY, float _wHead){
		parent = _parent;
	    startPosX = _startPosX;
	    startPosY = _startPosY;
	    wHead = _wHead ;
	  }
	  
	  
	  public void display(){
		parent.strokeWeight(1);
	    //fill(255);
		parent.stroke(255);
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
	    
	    float wBody = parent.width/10;
	    //float wHead = width/15;
	    float wEar = parent.width/30;
	    float wFeet = parent.width/15;
	    float hFeet = parent.width/30;
	    float wEyes = parent.width/50;
	    float hEyes = parent.width/40;
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
	    parent.ellipse((float) (startPosX-(wEar/1.2)), (startPosY-wHead)-wEar, wEar, wEar);
	    parent.ellipse((float) (startPosX+(wEar/1.2)), (startPosY-wHead)-wEar, wEar, wEar);
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
	    parent.arc(startPosX-(parent.width/108f), (startPosY-wHead)+(parent.height/50f), (parent.width/100), (parent.width/70), 0, PConstants.PI);
	    parent.arc(startPosX+(parent.width/108f), (startPosY-wHead)+(parent.height/50f), (parent.width/100), (parent.width/70), 0, PConstants.PI);
	    //belly
	    parent.noStroke();
	    parent.fill(225);
	    parent.ellipse(startPosX, startPosY, (float)(wBody/1.4), (float)(wBody/1.3));
	  }
}
