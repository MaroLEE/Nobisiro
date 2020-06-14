package mini;
import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class Board_test {
	
	@Test
	public void test1_1() {
		Board board = new Board();
		boolean actual = board.checkArea(1,1);
		
		assertThat(actual, is(true));

	}
	
	@Test
	public void test1_2() {
		Board board = new Board();
		boolean actual = board.checkArea(4,4);
		
		assertThat(actual, is(false));

	}
	
	@Test
	public void test2_1() {
		Board board = new Board();
		boolean actual = board.canPut(4,4);
		
		assertThat(actual, is(false));

	}
	
	@Test
	public void test2_2() {
		Board board = new Board();
		Cell cell = board.getCell(1,1);
		cell.setMark(0);
		boolean actual = board.canPut(1,1);
		
		assertThat(actual, is(false));

	}
	
	@Test
	public void test2_3() {
		Board board = new Board();
		boolean actual = board.canPut(1,1);
		
		assertThat(actual, is(true));

	}
	
	@Test
	public void test3_1() {
		Board board = new Board();
		Cell cell1 = board.getCell(0,0);
		cell1.setMark(0);
		Cell cell2 = board.getCell(1,1);
		cell2.setMark(0);
		Cell cell3 = board.getCell(2,2);
		cell3.setMark(0);
		boolean actual = board.checkWin();
		
		assertThat(actual, is(true));

	}
	@Test
	public void test3_2() {
		Board board = new Board();
		Cell cell1 = board.getCell(0,0);
		cell1.setMark(0);
		Cell cell2 = board.getCell(1,1);
		cell2.setMark(1);
		Cell cell3 = board.getCell(2,2);
		cell3.setMark(0);
		boolean actual = board.checkWin();
		
		assertThat(actual, is(false));
	}
	@Test
	public void test4_1() {
		Board board = new Board();
		Cell cell1 = board.getCell(1,1);
		cell1.setMark(0);
		Cell cell2 = board.getCell(0,0);
		cell2.setMark(1);
		Cell cell3 = board.getCell(0,2);
		cell3.setMark(0);
		Cell cell4 = board.getCell(2,0);
		cell4.setMark(1);
		Cell cell5 = board.getCell(1,0);
		cell5.setMark(0);
		Cell cell6 = board.getCell(1,2);
		cell6.setMark(1);
		Cell cell7 = board.getCell(0,1);
		cell7.setMark(0);
		Cell cell8 = board.getCell(2,1);
		cell8.setMark(1);
		Cell cell9 = board.getCell(2,2);
		cell9.setMark(0);
		boolean actual = board.checkFull();
		
		assertThat(actual, is(true));
	}
	@Test
	public void test4_2() {
		Board board = new Board();
		Cell cell1 = board.getCell(0,0);
		cell1.setMark(0);
		Cell cell2 = board.getCell(1,1);
		cell2.setMark(1);
		
		boolean actual = board.checkFull();
		
		assertThat(actual, is(false));

	}
	



}
