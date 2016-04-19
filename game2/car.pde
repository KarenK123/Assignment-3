class car{
  float xPos;
  float yPos;

car(float _xPos, float _yPos){
  xPos = _xPos;
  yPos = _yPos;
}


void display(){
  rectMode(CORNER);
  
  //car width and height
  float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263);
  
  fill(255, 0, 0);
  stroke(255,  0, 0);
  //exhaust
  rect(xPos+cWidth, yPos+(cHeight/1.5), (cWidth/11.66), (cWidth/17.5));
  //body 
  rect(xPos, yPos, cWidth, cHeight);
  fill(0);
  stroke(255);
  //wheels
  ellipse(xPos+(cWidth/5), yPos+(cHeight), (cWidth/3.5), (cWidth/3.5));
  ellipse(xPos+(cWidth/1.2), yPos+(cHeight), (cWidth/3.5), (cWidth/3.5));
  fill(255);
  ellipse(xPos+(cWidth/5), yPos+(cHeight), (cWidth/7), (cWidth/7));
  ellipse(xPos+(cWidth/1.2), yPos+(cHeight), (cWidth/7), (cWidth/7));
  fill(0);
  ellipse(xPos+(cWidth/5), yPos+(cHeight), (cWidth/8.75), (cWidth/8.75));
  ellipse(xPos+(cWidth/1.2), yPos+(cHeight), (cWidth/8.75), (cWidth/8.75));;
  fill(255, 0, 0);
  stroke(255, 0, 0);
  //hood
  bezier(xPos+(cWidth/8), yPos, 
  xPos+(cWidth/8), yPos-(cHeight*1.5), 
  xPos+(cWidth), yPos-(cHeight*1.5), 
  xPos+(cWidth), yPos);
  //window
  fill(0);
  arc(xPos+(cWidth/1.8), yPos, (cWidth/1.4), (cHeight/.6), -PI, 0, CHORD);
  
  
}

void move(){
  xPos = xPos - speed;
  if (xPos < 0){
    xPos = width;
    
  }
}


}