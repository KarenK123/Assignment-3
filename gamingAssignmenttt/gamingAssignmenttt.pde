sprite mysprite;
tree mytree;


void setup(){
  size(650, 300);
  mysprite= new sprite(0,height);
  mytree = new tree(0);
  
  float stageZone = (height*.75);
  float upperZone = (height*.25);

}



void draw(){
  background();
  mysprite.display();
  mytree.display();
  
}