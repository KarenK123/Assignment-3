sprite mysprite;
tree mytree;
bird mybird;
bird mybird1;
bird2 mybird2;
bird2 mybird21;

void setup(){
  size(650, 300);
  background();
  smooth();
  mysprite= new sprite(height-(height/7));
  mytree = new tree(0);
  mybird = new bird(10, 20, 5, 30);
  mybird1 = new bird(100, 60, 4, 30);
  mybird2 = new bird2(100, 40, 4, 30, 100);
  mybird21 = new bird2(10, 80, 5, 30, 200);
  
  float stageZone = (height*.75);
  float upperZone = (height*.25);

}

float startPosX = (width/10);
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
  
}



void keyPressed(){ // This function is called everytime a key is pressed.
  if(key == CODED)
  {
    if (keyCode == LEFT)
    {
      startPosX-=speed;
    }
    else if (keyCode == RIGHT)
    {
      startPosX+=speed;
    }
  } 
} // End of keyPressed()