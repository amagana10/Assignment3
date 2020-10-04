import acm.program.*;
import acm.graphics.*;
import acm.util.*; 

public class RandomCircles extends GraphicsProgram {

	 private static final int NCIRCLES = 10;
	 private static final int MIN_RADIUS = 5;
	 private static final int MAX_RADIUS = 50;
	 
	 private RandomGenerator randgen = RandomGenerator.getInstance(); 
	 
	 public void run() {
		 for(int i = 0; i < NCIRCLES; i++) {
			 addCircle();
		 }
	 }

	private void addCircle() {
		int diameter = 2 * randgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		int x = randgen.nextInt(0, getWidth()- diameter);
		int y = randgen.nextInt(0, getHeight()- diameter);
		
		GOval circle = new GOval(x,y,diameter, diameter);
		circle.setFilled(true);
		circle.setFillColor(randgen.nextColor());
		
		add(circle);
	}
}
