package mini;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;



public class Cell_test {
	@Test
	public void test1_1() {
		Cell cell1 = new Cell(1,1);
		cell1.setMark(0);
		int actual = cell1.getMark();
		assertThat(actual,is(0));
	}
	@Test
	public void test1_2() {
		Cell cell1 = new Cell(1,1);
		int actual = cell1.getMark();
		assertThat(actual,is(2));
	}

}

	


