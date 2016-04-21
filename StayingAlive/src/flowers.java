import processing.core.PApplet;

public class flowers {
	PApplet parent;
	float x;
	float y;
	  
	  
	  flowers(PApplet _parent, int _x, float _y){
		parent = _parent;
	    x=_x;
	    y=_y;
	  }
	  



	public void display(){
	  parent.noStroke();
	  for(float i=0; i<parent.width; i+=(parent.width/50)){
		  parent.fill(250, 139, 209);
		  parent.ellipse(x+i, y, (parent.width/100), (parent.width/100));
		  parent.ellipse(x+i+(parent.width/200), y+(parent.width/200), (parent.width/100), (parent.width/100));
		  parent.ellipse(x+i+(parent.width/100), y, (parent.width/100), (parent.width/100));
		  parent.ellipse(x+i+(parent.width/200), y-(parent.width/200), (parent.width/100), (parent.width/100));
		  parent.fill(255, 255, 0);
		  parent.ellipse(x+i+(parent.width/200), y, (parent.width/200), (parent.width/200));
	  }
	  }
}
