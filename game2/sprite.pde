class sprite2{
  float startPosX;
  float startPosY;
  float wHead;
  
  //consrtuctor
  sprite2(float _startPosX, float _startPosY, float _wHead){
    startPosX = _startPosX;
    startPosY = _startPosY;
    wHead = _wHead;
  }
  
  
  void display(){
    strokeWeight(1);
    //fill(255);
    stroke(255);
    
    float wBody = width/15;
    //float wHead = width/22.5;
    float wEar = width/45;
    float wFeet = width/22.5;
    float hFeet = width/45;
    float wEyes = width/75;
    float hEyes = width/60;
    
    
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
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), wEyes, hEyes);
    fill(0);
    ellipse(startPosX-(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    ellipse(startPosX+(width/90), (startPosY-wHead)-(height/70), (wEyes/2), (hEyes/2));
    //smile
    ellipse(startPosX, (startPosY-wHead)+(height/90), (width/65), (width/65));
    stroke(0);
    noFill();
    arc(startPosX-(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    arc(startPosX+(width/108), (startPosY-wHead)+(height/50), (width/100), (width/70), 0, PI, OPEN);
    //belly
    noStroke();
    fill(225);
    ellipse(startPosX, startPosY, (wBody/1.4), (wBody/1.3));
  }



}