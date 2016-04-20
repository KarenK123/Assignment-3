void draw(){
  switch(mode){
    
      case 0: {
      background();
      homepage();
      }
      break;
      
      
      
      
      case 1: {
          
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
        
        fill(#F773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(#FAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(#FAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
    break;
    
    
    
    
    
    case 2:{
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
        
        fill(#F773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(#FAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wHead + mybird32.wbird/2 ){
        lose();
      }
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(#FAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
      break;
      
      
      
      
      
      case 3:{
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
        
        fill(#F773E8);
        text("Lives:" +score/10, width-150, 20);
      
        if(mysprite.startPosX > width){
        String lines[] = loadStrings("Win.txt");
            for (int i = 0; i < lines.length; i++) {
               fill(#FAA803);
               text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird3.xcent, mybird3.ycent) < mysprite.wHead + mybird3.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird32.xcent, mybird32.ycent) < mysprite.wHead + mybird32.wbird/2 ){
        lose();
      }
      
      if(dist( mysprite.startPosX, mysprite.startPosY, mybird33.xcent, mybird33.ycent) < mysprite.wHead + mybird33.wbird/2 ){
        lose();
      }
      
      if(score < 0){
        String lines[] = loadStrings("Lose.txt");
            for (int i = 0; i < lines.length; i++) {
              fill(#FAA803);
              text(lines[i], (width/4), (height/3), (width/2), (height/2));  // Text wraps within text box
            }
        noLoop();
        }
      }
      break;
      
      
      
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
    
    
  }//end switch
   
   
}//end draw