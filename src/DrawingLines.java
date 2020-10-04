import acm.graphics.*;
import acm.program.*;
import java.awt.event.*; 

public class DrawingLines extends GraphicsProgram{
	private GLine line;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		 int x = e.getX();
		 int y = e.getY();
		 line = new GLine(x, y, x, y);
		 line.setVisible(true);
		 add(line);
		 }
	public void mouseDragged(MouseEvent e) {
		 int x = e.getX();
		 int y = e.getY();
		 line.setEndPoint(x, y);
		 } 


}
