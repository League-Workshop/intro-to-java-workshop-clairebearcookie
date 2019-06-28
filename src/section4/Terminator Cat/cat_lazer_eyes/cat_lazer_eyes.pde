int acceleration=5;
int XL = 354;
int YL = 564;
PImage catPIC;
void setup(){
  size(800,800);
  catPIC =loadImage("Orange Cat.jpg");
  catPIC.resize(width,height);
  background(catPIC);
  
}

void draw() {
  if(mousePressed){
    println("Mouse's x-position: " +mouseX+"\n"+"Mouse's y-position:"+ mouseY+"\n");}
    fill(255,102,13);
    noStroke();
    ellipse(XL,YL,60,60);
    keyPressed();
    
    
    
    
    ellipse(451,573,60,60);
  
}
void keyPressed() {
 XL-=2*acceleration;
 YL+=2*acceleration;
 ellipse(XL+100,YL,60,50);
}
