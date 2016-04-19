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
  float hbird = (height/12.5);
  //center to right side of bird
  float radius1 = (xcent+(wbird/2));
  //center to left side of bird
  float radius2 = (xcent-(wbird/2));
  //center to top of birds head
  float radiust = (ycent-(hbird/2));
  
  //body
  fill(100, 15, 150);
  ellipse(xcent, ycent, wbird, hbird);
  
  //beak
  fill(252, 216, 5);
  stroke(0);
  triangle(radius2, ycent, radius2+(wbird / 12), ycent-(wbird / 6), radius2-(wbird / 3), ycent);
  triangle(radius2, ycent, radius2+(wbird / 12), ycent+(wbird / 6), radius2-(wbird / 3), ycent);
 
  //eyes
  noStroke();
  fill(255);
  ellipse(xcent-(wbird / 4), ycent, (wbird / 4), (wbird / 4));
  fill(0);
  ellipse(xcent-(wbird / 4), ycent, (wbird / 8), (wbird / 8));
  
  
  //hair
  //cant put in for loop because of ellipse slope
  fill(100, 100, 80);
   triangle(xcent, radiust, xcent, radiust-(hbird / 4), xcent+(hbird / 4), radiust+(hbird / 24) );
  triangle(xcent-(hbird / 4), radiust+(hbird/18), xcent-(hbird / 4), radiust-(hbird / 4), xcent, radiust );
  triangle(xcent-(hbird / 2), radiust+(hbird / 7), xcent-(hbird / 2), radiust-(hbird / 4), xcent-(hbird / 4), radiust+(hbird/18));
  
   
  //wing
  fill(255, 0, 255);
  bezier(radius1, ycent+(wbird / 12), radius1+(wbird / 3), ycent-(wbird / 3), radius1+(wbird / 3), ycent-(wbird / 3), radius1-(wbird / 30), ycent-(wbird / 6));
  
  }
}
}