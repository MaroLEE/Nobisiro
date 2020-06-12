package mini;
import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class Board_test {
	Board board;
	
	@Before
	public void setUp(){
	board = new Board();
	}
	
	@Test
	public void test1() {
		
		board.setCoordinates(1,1);
		boolean result = board.checkArea(1,1);
		assertThat(result,is(true));
	}
	
	@Test
	public void test2() {
		board.setCoordinates(4,4);
		boolean result = board.checkArea(4,4);
		assertThat(result,is(false));
	}

}
