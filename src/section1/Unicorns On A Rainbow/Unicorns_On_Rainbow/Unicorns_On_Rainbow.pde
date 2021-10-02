PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rainbow.png");
  size(800,600);
  rainbow.resize(800,600);
  unicorn = loadImage("unicorn.png");
  
}

void draw() {
 background(rainbow); 
 image(unicorn, mouseX-250, mouseY-200);
}
