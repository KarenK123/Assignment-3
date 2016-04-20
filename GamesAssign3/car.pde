class car{
  float xPos;
  float yPos;
  float cWidth;
  //float wheel1X;
  //float wheel2X;
  //float wheelY;

car(float _xPos, float _yPos, float _cWidth){
  xPos = _xPos;
  yPos = _yPos;
  cWidth = _cWidth;
  //wheel1X = _wheel1X;
  //wheel2X = _wheel2X;
  //wheelY = _wheelY;
}


void display(){
  rectMode(CORNER);
  
  //car width and height
  //float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263);
  float wheel1X = xPos+(cWidth/5);   
  float wheel2X = xPos+(cWidth/1.2);
  float wheelY = yPos+(cHeight);
  
  fill(255, 0, 0);
  stroke(255,  0, 0);
  //exhaust
  rect(xPos+cWidth, yPos+(cHeight/1.5), (cWidth/11.66), (cWidth/17.5));
  //body 
  rect(xPos, yPos, cWidth, cHeight);
  fill(0);
  stroke(255);
  //wheels
  ellipse(wheel1X, wheelY, (cWidth/3.5), (cWidth/3.5));
  ellipse(wheel2X, wheelY, (cWidth/3.5), (cWidth/3.5));
  fill(255);
  ellipse(wheel1X, wheelY, (cWidth/7), (cWidth/7));
  ellipse(wheel2X, wheelY, (cWidth/7), (cWidth/7));
  fill(0);
  ellipse(wheel1X, wheelY, (cWidth/8.75), (cWidth/8.75));
  ellipse(wheel2X, wheelY, (cWidth/8.75), (cWidth/8.75));;
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