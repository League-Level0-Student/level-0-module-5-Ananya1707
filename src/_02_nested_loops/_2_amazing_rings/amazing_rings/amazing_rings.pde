int placeX1 = 750;
int placeX2 = 250;
void setup() {
  size(1000,500);
  background(255);
  
}

void draw() {
  int size = 480;
  background(255);
  
  
  for(int i = 0 ; i < 48; i++) {
    noFill();
    ellipse(placeX2,250,size,size);
    size = size - 10;
    
    
    if(i%2 == 0){
      fill(0,0,0);

    }else {
     fill(255,255,255);
    }
  }
  placeX2 = placeX2 + 1;
  
  for(int i = 0 ; i < 48; i++) {
    noFill();
    ellipse(placeX1,250,size,size);
    size = size - 10;
    
    
    if(i%2 == 0){
      fill(0,0,0);

    }else {
     fill(255,255,255);
    }
  }
  placeX1 = placeX1 - 1;
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
