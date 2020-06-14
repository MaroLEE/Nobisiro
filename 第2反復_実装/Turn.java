package mini;

public class Turn {
	private int mark;
	private int x;
	private int y;

	public Turn (Player nowPlayer) {
		Player player = new Player("first");
		}
	
	public void turnStart() {
		Cell cell = new Cell(x, y);
		cell.setCoordinates();
		
		Board board = new Board();
		
		board.checkWin();
			if(board.checkWin() == true) {
				board.showBoard();
				System.out.println("勝者:" + nowPlayer);
			}
		board.checkFull();
	}
	
	public void showHistory() {
		System.out.print(player.getPlayer() + ":(" + cell.getX() + "," + cell.getY() + ") ");
		int mark = cell.getMark();
		if(mark == 0) {
			System.out.println("○");
		}
		else if(mark == 1) {
			System.out.println("×");
		}
	}
}
