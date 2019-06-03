void setup(){
size(400,800);
 background(250,35,28); 
  
}
void draw(){
  if(mousePressed){
  fill(35,219,250);
  }
  else{
    delay(1000);
    fill(random(255), random(255),5);
  }
 ellipse(100,100,100,100); 
 if(mousePressed){
 fill(227,73,219);
 }
 triangle(50,70,40,80,60,90);
 fill(90,245,57);
  rect(140,140,140,140);
}
