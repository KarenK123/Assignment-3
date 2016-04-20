void background(){
  
  float stageZone = (height*.75);
  
  
  
 
  int r = 0;
  int g = 0;
  //int b; for blue
  
  for( int i=0; i < height; i++){
    stroke(r, g, i);
    line(0, i, width, i);
    noStroke();
}


//rect is stage
  fill(#4E7142);
  rect(0, stageZone, width, (height*.25));

  
}