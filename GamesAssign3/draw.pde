void draw(){
  
  
  background();
 
  mytree.display();
  myflowers.display();
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
  fill(#F773E8);
  text("Lives:" +score/10, width-150, 20);
  
  if(mysprite.startPosX > width){
    text("You WIN!", width/2, height/2);
  noLoop();
  }
  
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
    lose();
  }
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wHead+ mybird32.wbird/2 ){
    lose();
  }
  if(dist(mysprite.startPosX, mysprite.startPosY, mybird33.xcent, mybird33.ycent) < mysprite.wHead + mybird33.wbird /2){
    lose();
  }
  if(dist( mysprite.startPosX, mysprite.startPosY, mybird34.xcent, mybird34.ycent) < mysprite.wHead + mybird34.wbird/2 ){
    lose();
  }
  
  if(score < 0){
    text("You LOSE!", width/2, height/2);
  noLoop();
  }
  
  //control buttons
  //ellipse(width-(width/20), height-(width/20), width/20, width/20);
  //ellipse(0+(width/20), height-(width/20), width/20, width/20);
  
}