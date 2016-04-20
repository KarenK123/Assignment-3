class tree{
  float trunk;
  
  
  tree(float _trunk){
    trunk = _trunk;
  }
  
  
  void display(){
     float stageZone = (height*.75);
 
     float upperZoneBark = ((height*.25)+height/20);
  
    noFill();
    
    //tree trunks
    //noStroke();
    fill(#50463D);
    /*float trunkVer1 = (width/21.666);
    float trunkVer2 = (width/10.8333);
    float trunkVer3 = (width/5.909);
    float trunkVer4 = (width/8.125);
    
    for(float i = 10; i<6; i+= 200){
    bezier(trunkVer1+i,upperZoneBark,  trunkVer2+i,((stageZone+upperZoneBark)/2),  trunkVer2+i,((stageZone+upperZoneBark)/2),   trunkVer1+i,stageZone);
    bezier(trunkVer3+i,stageZone,   trunkVer4+i,((stageZone+upperZoneBark)/2),    trunkVer4+i,((stageZone+upperZoneBark)/2),     trunkVer3+i,upperZoneBark);
    }*/
    float trunkVer1 = (width/21.666);
    float trunkVer2 = (width/8.8333);
    float trunkVer3 = (width/5.909);
    //float trunkVer4 = (width/8.125);
    for(float i=0; i<3500; i+=(width/4)){
    strokeWeight(10);
    stroke(#50463D);
    line(trunkVer1+i+(width/13),stageZone, trunkVer1+i+(width/13),upperZoneBark);
    }
    

    
    
    //treeBush
    noStroke();
    fill(#0A581C);
    for(float j=10; j<3500; j+= (width/4)){
    ellipse(trunkVer1+j, upperZoneBark, trunkVer2, trunkVer2);
    ellipse(trunkVer3+j, upperZoneBark, trunkVer2, trunkVer2);
    ellipse(trunkVer1+j, upperZoneBark-(height/6), trunkVer2, trunkVer2);
    ellipse(trunkVer3+j, upperZoneBark-(height/6), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25), upperZoneBark+(height/30), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25), upperZoneBark-(height/5), trunkVer2, trunkVer2);
    ellipse(trunkVer1+j+(width/16.25), upperZoneBark-(height/10), trunkVer2, trunkVer2);
    
    }
  }
}
  