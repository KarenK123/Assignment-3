class sprite{
  float startPosY;
  
  //consrtuctor
  sprite(float _startPosY){
    startPosY = _startPosY;
  }
  
  
  void display(){
    strokeWeight(1);
    //fill(255);
    stroke(255);
    /*
    //left leg and right leg
    line(startPosX, startPosY, startPosX+width/43.33, startPosY-(height/12));
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/26), startPosY);
    //body
    line(startPosX+(width/43.33), startPosY-(height/12), startPosX+(width/43.33), startPosY-(height/4.2857));
    //head
    ellipse(startPosX+(width/43.33), startPosY-(height/3.75), (width/16.25) , (width/16.25));
    //left arm and right arm
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX, startPosY-(height/5));
    line(startPosX+(width/43.33), startPosY-(height/7.5), startPosX+(width/21.6666), startPosY-(height/5));*/
    float wBody = width/10;
    float wHead = width/15;
    float wEar = width/30;
    float wFeet = width/15;
    float hFeet = width/30;
    float wEyes = width/50;
    float hEyes = width/40;
    noStroke();
    fill(#9B9794);
    //feet
    ellipse(startPosX-(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    ellipse(startPosX+(wFeet/2), startPosY+hFeet, wFeet, hFeet);
    //body
    ellipse(startPosX, startPosY, wBody, wBody);
    //arms
    //bezier(startPosX, startPosY-40, startPosX-70, startPosY, startPosX-50, startPosY, startPosX-30, startPosY+8 );
    //bezier(startPosX, startPosY-40, startPosX+70, startPosY, startPosX+50, startPosY, startPosX+30, startPosY+8 );
    //ears
    ellipse(startPosX-(wEar/1.2), (startPosY-wHead)-wEar, wEar, wEar);
    ellipse(startPosX+(wEar/1.2), (startPosY-wHead)-wEar, wEar, wEar);
    //head
    ellipse(startPosX, startPosY-wHead, wHead, wHead);
    //eyes
    fill(255);
    ellipse(startPosX-10, (startPosY-wHead)-5, wEyes, hEyes);
    ellipse(startPosX+10, (startPosY-wHead)-5, wEyes, hEyes);
    fill(0);
    ellipse(startPosX-10, (startPosY-wHead)-5, (wEyes/2), (hEyes/2));
    ellipse(startPosX+10, (startPosY-wHead)-5, (wEyes/2), (hEyes/2));
    //smile
    ellipse(startPosX, (startPosY-wHead)+5, 10, 10);
    stroke(0);
    noFill();
    arc(startPosX-6, (startPosY-wHead)+5, 10, 10, 0, PI, OPEN);
    arc(startPosX+6, (startPosY-wHead)+5, 10, 10, 0, PI, OPEN);
    //belly
    noStroke();
    fill(225);
    ellipse(startPosX, startPosY, (wBody/1.4), (wBody/1.3));
  }



}