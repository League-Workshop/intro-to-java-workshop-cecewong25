int x = 100;
int size = 50;
void setup(){
 size( 800,800);
  
  
}
void draw(){
  if(mousePressed){
    delay(1000);
  fill(random(255),random(255),random(255));
  size = size+10;
  }
  else{
  fill(0,255,0);
  }
 ellipse(mouseX,mouseY,size,size); 
}
