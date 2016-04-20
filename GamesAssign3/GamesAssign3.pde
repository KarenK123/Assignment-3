sprite mysprite;
tree mytree;
bird mybird;
bird mybird1;
bird2 mybird2;
bird2 mybird21;
bird3 mybird3;
bird3 mybird32;
bird3 mybird33;
bird3 mybird34;

void setup(){
  //size(650, 300);
  fullScreen();
  orientation(LANDSCAPE);
  background();
  smooth();
  
  mysprite= new sprite((width/10), height-(height/7), width/10);
  mytree = new tree(0);
  mybird = new bird(0, (height/5), (width/130), (width/20));
  mybird1 = new bird((width/2), (height/15), (width/160), (width/20));
  mybird2 = new bird2((width/2), (height/7.5), (width/160), (width/20), 100);
  mybird21 = new bird2(0, (height/15), (width/130), (width/20), 200);
  //float _xcent, float _ycent, float _speed, float _wbird
  mybird3 = new bird3(random(0, width), 0, (width/190), (width/20), 200);
  mybird32 = new bird3(random(0, width), 0, (width/150), (width/20), 200);
  mybird33 = new bird3(random(0, width), 0, (width/170), (width/20), 200);
  mybird34 = new bird3(random(0, width), 0, (width/210), (width/20), 200);
  
  float stageZone = (height*.75);
  float upperZone = (height*.25);

}

int speed = 20;



void draw(){
  
  
  background();
  mytree.display();
  mysprite.display();
  mybird.display();
  mybird.move();
  mybird1.display();
  mybird1.move();
  mybird2.display();
  mybird2.move();
  mybird21.display();
  mybird21.move();
  mybird3.display();
  mybird3.move();
  mybird32.display();
  mybird32.move();
  mybird33.display();
  mybird33.move();
  mybird34.display();
  mybird34.move();
  
  
  if(mysprite.startPosX > width){
  noLoop();
  }
  
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wBody + mybird3.wbird/2 ){
    lose();
  }
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wBody+ mybird32.wbird/2 ){
    lose();
  }
  if(dist(mysprite.startPosX, mysprite.startPosY, mybird33.xcent, mybird33.ycent) < mysprite.wBody + mybird33.wbird /2){
    lose();
  }
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird34.xcent, mybird34.ycent) < mysprite.wBody + mybird34.wbird/2 ){
    lose();
  }
  
  if(score < -50){
  noLoop();
  }
  
}





void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == LEFT)
    {
      mysprite.startPosX-=speed;
    }
    else if (keyCode == RIGHT)
    {
      mysprite.startPosX+=speed;
    }
  } 
} // End of keyPressed()