//clouds class

//creating class
class cloud{
  //x and y are coordinates of where the clouds start
 float x;
 float y;
 float speed;
 
 //constructor
 cloud(float _x, float _y, float _speed){
   x = _x;
   y = _y;;
   speed = _speed;
   
 }
 
 //creating function
 void display(){
 noStroke();
 fill(255);
 
 float zonez = (height/10);
 
 //the width and height of one of five circles that make a cloud
 float cloudw = (width/18);
 float cloudh = (zonez);
 
 //x0   y40
 //c is circle ie. c1, c2...c6 make a cloud
 float c1 = x+(cloudw*1.2);
 float c2 = x+(cloudw*.6);
 float c3 = y+(cloudw*.6);
 float c5 = y+(cloudw*.7);
 
 
 for(float c=0; c<=(width*3); c+=(width/3)){
 float cy=0;
 ellipse(x+c, y+cy, cloudw, cloudh);
 ellipse(c2+c, y+cy, cloudw, cloudh);
 ellipse(c1+c, y+cy, cloudw, cloudh);
 ellipse(x+c, c3+cy, cloudw, cloudh);
 ellipse(c2+c, c5+cy, cloudw, cloudh);
 ellipse(c1+c, c3+cy, cloudw, cloudh); 
 }
 
 
  for(float c=(width/6); c<=(width*3); c+=(width/3)){
   for(float cy2=20; cy2<=20; cy2+=20) {
     ellipse(x+c, y+cy2, cloudw, cloudh);
     ellipse(c2+c, y+cy2, cloudw, cloudh);
     ellipse(c1+c, y+cy2, cloudw, cloudh);
     ellipse(x+c, c3+cy2, cloudw, cloudh);
     ellipse(c2+c, c5+cy2, cloudw, cloudh);
     ellipse(c1+c, c3+cy2, cloudw, cloudh); 
   }
 }
 
}  


void move(){
  x = x - speed;
  if (x < -(width*width)){
    x = width;      
  }
}

}
 