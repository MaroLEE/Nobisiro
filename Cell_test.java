package mini;

import org.junit.Test;

public class Cell_test {
	@Test
	public void test1_1() {
		Cell cell1 = new Cell(1,1);
		cell1.setMark(0);
		System.out.println(cell1.getMark());
	}
	@Test
	public void test1_2() {
		Cell cell1 = new Cell(1,1);
		System.out.println(cell1.getMark());
	}

}
