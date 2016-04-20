//the third bird class, it is a subclass of the superclass bird

//create class
class bird3 extends bird{
  float colour;
  
  //consrtuctor
  bird3(float xcent, float ycent, float speed, float wbird, float _colour){
    super(xcent, ycent, speed, wbird);
    colour = _colour;
  }
  
  //create function
  void display(){
    
  //float wbird = (width/15);
  float hbird = (wbird/.9);
  //center to right side of bird

  

  
  //body
  fill(100, 15, 150);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 216, 5);
  stroke(0);
  triangle(xcent-(width/86.66), ycent+(hbird/2)-(height/120), xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(height/30));
  triangle(xcent+(width/86.66), ycent+(hbird/2)-(height/120) , xcent, ycent+(hbird/2), xcent, ycent+(hbird/2)+(height/30));
 
  //eyes
  noStroke();
  fill(255);
  ellipse(xcent, ycent+(hbird/4), (wbird / 4), (wbird / 4));
  fill(0);
  ellipse(xcent, ycent+(hbird/4), (wbird / 8), (wbird / 8));
  
  
  //hair
  //cant put in for loop because of ellipse slope
  fill(100, 100, 80);
  triangle(xcent-(wbird/2)+(width/150), ycent+(height/40), xcent-(wbird/2)-(width/65), ycent+(height/40), xcent-(wbird/2), ycent+(height/120));
  triangle(xcent-(wbird/2), ycent+(height/120), xcent-(wbird/2)-(width/65), ycent, xcent-(wbird/2)+(width/220), ycent-(height/60));
  triangle(xcent-(wbird/2)+(width/260), ycent-(height/60), xcent-(wbird/2)-(width/60), ycent-(height/50), xcent-(wbird/2)+(width/140), ycent-(height/30));
  
  
   
  //wing
  fill(255, 0, 255);
  bezier(xcent-(width/130), ycent-(hbird/2)+(height/150), 
  xcent-(width/65), ycent-(hbird/2)-(height/20), 
  xcent-(width/65), ycent-(hbird/2)-(height/20), 
  xcent+(width/130), ycent-(hbird/2)+(height/150));
  
  }
  
  void move(){
   
  ycent = ycent + speed;
  if (ycent > height){
    ycent = 0;
  }
  }
  
  
}