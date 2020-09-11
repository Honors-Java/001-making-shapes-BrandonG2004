// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  rect(200, 200, 100, 50);
  rect(300, 185 , 100, 15);
  rect(220, 270, 150, 80);
  ellipseMode(CORNER);
  ellipse(145,300, 35, 35);
  ellipse(175,300, 35, 35);
  ellipse(205,300, 35, 35);
 ellipse(235,300, 35, 35);
ellipse(265,300, 35, 35);

  
 
	

}