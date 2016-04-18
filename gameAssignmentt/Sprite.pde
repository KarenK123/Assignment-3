class sprite{
  float startPosX;
  float startPosY;
  
  //consrtuctor
  sprite(float _startPosX, float _startPosY){
    startPosX = _startPosX;
    startPosY = _startPosY;
  }
  
  
  void display(){
    fill(255);
    //left leg and right leg
    line(startPosX, startPosY, startPosX+width/43.33, startPosY-(height/12));
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/26), startPosY);
    //body
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/43.33), startPosY-(height/4.2857));
    //head
    ellipse(startPosX+(width/43.33), startPosY-(height/3.75), (width/16.25) , (width/16.25));
    //left arm and right arm
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX, startPosY-(height/5));
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX+(width/21.6666), startPosY-(height/5));
  }

}