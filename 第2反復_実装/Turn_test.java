package mini;
import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class Turn_test {
	
	@Test
	public void test1_1() {
		
		Player firstplayer = new Player("first");
		Player secondplayer = new Player("second");
		Turn turn = new Turn(firstplayer);
		Cell cell1 = new Cell(2,2);
		cell1.setMark(0);
		Cell cell2 = new Cell(2,1);
		cell2.setMark(1); 
		Cell cell3 = new Cell(1,1);
		cell3.setMark(0);
		Cell cell4 = new Cell(3,1);
		cell4.setMark(1);		
		Cell cell5 = new Cell(3,3);
		cell5.setMark(0);
	}		
		
	@Test
	public void test1_2() {
		
		Player firstplayer = new Player("first");
		Player secondplayer = new Player("second");
		Turn turn = new Turn(firstplayer);
		Cell cell1 = new Cell(2,2);
		cell1.setMark(0);
		Cell cell2 = new Cell(1,1);
		cell2.setMark(1); 
		Cell cell3 = new Cell(1,3);
		cell3.setMark(0);
		Cell cell4 = new Cell(3,1);
		cell4.setMark(1);		
		Cell cell5 = new Cell(2,1);
		cell5.setMark(0);
		Cell cell6 = new Cell(2,3);
		cell6.setMark(1);
		Cell cell7 = new Cell(1,2);
		cell7.setMark(0);
		Cell cell8 = new Cell(3,2);
		cell8.setMark(1);
		Cell cell9 = new Cell(3,3);
		cell9.setMark(0);
		
	}		

}
