package mini;

public class Cell {
	private int mark;
	private int x;
	private int y;
	
	public Cell(int x,int y) {
		this.x = x;
		this.y = y;
		this.mark = 2;  //2は空白を意味している。
		
	}
	public void setMark (int mark) {
		this.mark = mark;
	}
	public int getMark () {
		return mark;
		
	}
}
