import processing.core.PApplet;

public class tree {
	PApplet parent;
	float trunk;
	  
	  
	  tree(PApplet _parent, float _trunk){
		parent = _parent;
	    trunk = _trunk;
	  }
	  
	  
	  public void display(){
		  
	     float stageZone = (parent.height*.75f);
	     float upperZoneBark = ((parent.height*.25f)+parent.height/20);
	  
	    parent.noFill();
	    
	    //tree trunks
	    //noStroke();
	    parent.fill(28, 33, 31);  
	    /*float trunkVer1 = (width/21.666);
	    float trunkVer2 = (width/10.8333);
	    float trunkVer3 = (width/5.909);
	    float trunkVer4 = (width/8.125);
	    
	    for(float i = 10; i<6; i+= 200){
	    bezier(trunkVer1+i,upperZoneBark,  trunkVer2+i,((stageZone+upperZoneBark)/2),  trunkVer2+i,((stageZone+upperZoneBark)/2),   trunkVer1+i,stageZone);
	    bezier(trunkVer3+i,stageZone,   trunkVer4+i,((stageZone+upperZoneBark)/2),    trunkVer4+i,((stageZone+upperZoneBark)/2),     trunkVer3+i,upperZoneBark);
	    }*/
	    float trunkVer1 = (parent.width/21.666f);
	    float trunkVer2 = (parent.width/8.8333f);  
	    float trunkVer3 = (parent.width/5.909f);
	    //float trunkVer4 = (width/8.125);
	    for(float i=0; i<3500; i+=(parent.width/4)){
	    	parent.strokeWeight(10);
	    	parent.stroke(28,23,31);
	    	parent.line(trunkVer1+i+(parent.width/13),stageZone, trunkVer1+i+(parent.width/13),upperZoneBark);
	    }
	    

	    
	    
	    //treeBush
	    parent.noStroke();
	    parent.fill(73, 165, 91);   
	    for(float j=10; j<3500; j+= (parent.width/4)){
	    	parent.ellipse(trunkVer1+j, upperZoneBark, trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer3+j, upperZoneBark, trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer1+j, upperZoneBark-(parent.height/6), trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer3+j, upperZoneBark-(parent.height/6), trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer1+j+(parent.width/16.25f), upperZoneBark+(parent.height/30), trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer1+j+(parent.width/16.25f), upperZoneBark-(parent.height/5), trunkVer2, trunkVer2);
	    	parent.ellipse(trunkVer1+j+(parent.width/16.25f), upperZoneBark-(parent.height/10), trunkVer2, trunkVer2);
	    
	    }
	  }
}
