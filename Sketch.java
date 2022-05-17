import processing.core.PApplet;

public class Sketch extends PApplet {
	float backR = 135;
  float backG = 206;
  float backB = 235;
  float doorX = 450;
  float doorY = 450;
  float knobX = 520;
  String msg = "";
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  //background
    background(backR, backG, backB);

  //ground
	  fill(86, 125, 70);
    rect(0, (float)(height/1.14), width/1, height/8);

	  // red square
    fill(203, 65, 84);
    rect((float)(width/2.28), (float)(height/2.66), width/2, height/2);

    // door
    fill(150, 75, 0);
    rect(doorX, doorY, width/8, (float)(height/3.2));

    // door knob
    fill(172, 140, 24);
    ellipse(knobX, (float)(height/1.33), width/40, height/40);

    // window
    fill(135, 206, 235);  
    rect((float)(width/1.33), (float)(height/1.78), width/8, height/8);
    line((float)(width/1.23), (float)(height/1.78), (float)(width/1.23), (float)(height/1.45));
    line((float)(width/1.33), (float)(height/1.6), (float)(width/1.14), (float)(height/1.6));

    // roof
    fill(0, 0, 128);
    triangle((float)(width/2.66), (float)(height/2.66), (float)(width/1.45), height/8, width/1, (float)(height/2.66));

    if(mousePressed){
      fill(50, 158, 168);
      ellipse(mouseX, mouseY, 50, 50);
    }
    
    if(upPressed){
      doorY--;
    }
    if(downPressed){
      doorY++;
    }
    if(leftPressed){
      doorX--;
    }
    if(rightPressed){
      doorX++;
    }

    text(msg,0 ,30);

  }
  public void keyPressed() {

    if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    if (key == ' ') {
      backR = 90;
      backG = 190;
      backB = 190;
    }
    else if (keyCode == CONTROL) {
      backR = 150;
      backG = 200;
      backB = 90;
    }
  }
  public void keyReleased() {

    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
  }

  }
  public void mouseWheel() {

    knobX++;
  }
  public void keyTyped() {
    msg += key;
  }
  public void mouseReleased() {

    backR = 140;
    backG = 30;
    backB = 140;   
    }
 
}