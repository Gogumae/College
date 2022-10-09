package a1;

class ColorPoint extends Point {
	private String color;  //점의 색깔
	public void setColor(String color) {
		this.color= color; }
	public void showColorPoint() {
		System.out.println(color);
		showPoint();  //Point 클래스의 showPoint() 호출
	}
}