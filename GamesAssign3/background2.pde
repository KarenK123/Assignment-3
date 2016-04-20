void background2(){
  background(0);
  rectMode(CENTER);
  fill(255);
  noStroke();
  //noLoop();
  //float x=0;
  
  rectMode(CENTER);
  //line(0, (height/2), width, (height/2));
  for(float i=0; i<height; i+=40){
  //line(0, (height/2)+i, width, (height/2)+i);
  rect(width/2, 1+i, (width/10)+i, 15);
  }
 
}