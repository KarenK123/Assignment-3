void draw(){
  
  
  switch(mode){
    
    case 4:
    {
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    
    
    
    
    
    case 5:
    {
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      mycar2.display();
      mycar2.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar2.xPos, mycar2.yPos) < mysprite2.wHead + mycar2.cWidth/2 ){
        lose();
      }
      
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    
    
    
    
    
    case 6:
    {
      background2();
      mysprite2.display();
      mycar.display();
      mycar.move();
      mycar2.display();
      mycar2.move();
      mycar3.display();
      mycar3.move();
      fill(255);
      text("Lives:" +score/10, width-150, 20);
      
      if(mysprite2.startPosY < 0){
      noLoop();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar.xPos, mycar.yPos) < mysprite2.wHead + mycar.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar2.xPos, mycar2.yPos) < mysprite2.wHead + mycar2.cWidth/2 ){
        lose();
      }
      
      if(dist( mysprite2.startPosX, mysprite2.startPosY, mycar3.xPos, mycar3.yPos) < mysprite2.wHead + mycar3.cWidth/2 ){
        lose();
      }
      
      if(score < 0){
      noLoop();
      }
    }
    break;
    
    default:
    {
      background();
    }
    break;
    
    
    
    
  }
  
}