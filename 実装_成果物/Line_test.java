package mini;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class Line_test {
	@Test
	public void test1() {
		Cell cell1 = new Cell(1,1);
		Cell cell2 = new Cell(2,2);
		Cell cell3 = new Cell(3,3);
		cell1.setMark(0);
		cell2.setMark(0);
		cell3.setMark(0);
		
		Line line = new Line(cell1,cell2,cell3);
		boolean result = line.checkLine();
		assertThat(result,is(true));
	}
	
	@Test
	public void test2() {
		Cell cell1 = new Cell(1,1);
		Cell cell2 = new Cell(2,2);
		Cell cell3 = new Cell(3,3);
		cell1.setMark(0);
		cell3.setMark(0);
		
		Line line = new Line(cell1,cell2,cell3);
		boolean result = line.checkLine();
		assertThat(result,is(false));
	
	}
	
	
	
	

}
