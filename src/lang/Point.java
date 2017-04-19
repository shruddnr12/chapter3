package lang;

public class Point {
	private int x;
	private int y;
	
	public Point(){}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override  //디버깅 할때 많이 쓴다.
	public String toString() {
		return "Point [x=" + x + "]";
	}
	

}
