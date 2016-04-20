class car2 extends car{
    float colour;
    
car2(float xPos, float yPos, float cWidth, float _colour){
  super(xPos, yPos, cWidth);
  colour = _colour;
}


  void display(){
  rectMode(CORNER);
  
  //car width and height
  //float cWidth = (width/6);//175
  float cHeight = (cWidth/7.36842105263);
  float wheel1X = xPos+(cWidth/5);   
  float wheel2X = xPos+(cWidth/1.2);
  float wheelY = yPos+(cHeight);
  
  fill(#49A55B);
  stroke(#49A55B);
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
  fill(#49A55B);
  stroke(#49A55B);
  //hood
  bezier(xPos+(cWidth/8), yPos, 
  xPos+(cWidth/8), yPos-(cHeight*1.5), 
  xPos+(cWidth), yPos-(cHeight*1.5), 
  xPos+(cWidth), yPos);
  //window
  fill(0);
  arc(xPos+(cWidth/1.8), yPos, (cWidth/1.4), (cHeight/.6), -PI, 0, CHORD);
  
  
}
}