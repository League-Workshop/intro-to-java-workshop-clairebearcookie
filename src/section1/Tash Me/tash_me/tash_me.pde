PImage mustache;
PImage mermaid;
void setup() { 
  mermaid=loadImage("mermaid.jpg");

  size(800, 600);

  mermaid.resize(width, height);
  mustache=loadImage("mustache3.jpg");
}
void draw() {
  background(mermaid);  
  if (mousePressed) {
    image(mustache, mouseX, mouseY);
  }
}
