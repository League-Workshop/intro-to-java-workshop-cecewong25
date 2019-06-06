PImage catPic;

void setup(){
   size( 1000,800);
   catPic = loadImage("cat.jpg");

                catPic.resize(width, height);

background(catPic);
  
}
void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
   ellipse(mouseX, mouseY, width, height);
    fill(234,38,64);


  
  
}
void keyPressed() {

                mouseX++;

mouseY++;

}
