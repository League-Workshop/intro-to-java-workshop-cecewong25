PImage rainbow;
  PImage unicorn;
void setup(){
 rainbow = loadImage("RAInBOW.jpg");
  size(800,600);
  rainbow.resize(width,height);
  unicorn = loadImage("unicorn.jpeg");
  
}
void draw(){
background(rainbow);
image(unicorn, mouseX, mouseY); 
}
