void background(){
  rectMode(CENTER);
  fill(255);
  noStroke();
  //noLoop();
  /*float x=0;
  for(float i=0; i<=height; i+=20){
    for(float j=0; j<10; j+=10){
     rect((width/2), x+i, (width/4)+j, height/30); 
    }
  }*/
  
  rect((width/2), 0, (width/4), height/30);
  rect((width/2), 20, (width/4)+10, height/30);
  rect((width/2), 40, (width/4)+20, height/30);
  rect((width/2), 60, (width/4)+30, height/30);
  rect((width/2), 80, (width/4)+40, height/30);
  rect((width/2), 100, (width/4)+50, height/30);
  rect((width/2), 120, (width/4)+60, height/30);
  rect((width/2), 140, (width/4)+70, height/30);
  rect((width/2), 160, (width/4)+80, height/30);
  rect((width/2), 180, (width/4)+90, height/30);
  rect((width/2), 200, (width/4)+100, height/30);
  rect((width/2), 220, (width/4)+110, height/30);
  rect((width/2), 240, (width/4)+120, height/30);
  rect((width/2), 260, (width/4)+130, height/30);
  rect((width/2), 280, (width/4)+140, height/30);
  rect((width/2), 300, (width/4)+150, height/30);
}