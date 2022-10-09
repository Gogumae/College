package a1;

public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point();
		p.set(10,20);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(30, 40);
		cp.setColor("violet");
		cp.showColorPoint();
	}
}
