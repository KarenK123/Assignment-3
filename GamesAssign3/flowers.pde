class flowers{
  float x;
  float y;
  
  
  flowers(float _x, float _y){
    x=_x;
    y=_y;
  }
  
  
  void display(){
  noStroke();
  for(float i=0; i<width; i+=(width/50)){
  fill(#FA8BD1);
  ellipse(x+i, y, (width/100), (width/100));
  ellipse(x+i+(width/200), y+(width/200), (width/100), (width/100));
  ellipse(x+i+(width/100), y, (width/100), (width/100));
  ellipse(x+i+(width/200), y-(width/200), (width/100), (width/100));
  fill(#FAE205);
  ellipse(x+i+(width/200), y, (width/200), (width/200));
  }
  }
}