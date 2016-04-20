void draw(){
  background(0);
  background();
  mysprite.display();
  mycar.display();
  mycar.move();
  mycar2.display();
  mycar2.move();
  mycar3.display();
  mycar3.move();
  fill(255);
  text("Lives:" +score/10, width-150, 20);
  
  if(mysprite.startPosY < 0){
  noLoop();
  }
  
  if(dist( mysprite.startPosX, mysprite.startPosY, mycar.xPos, mycar.yPos) < mysprite.wHead + mycar.cWidth/2 ){
    lose();
  }
  
  if(score < 0){
  noLoop();
  }
  
  
}