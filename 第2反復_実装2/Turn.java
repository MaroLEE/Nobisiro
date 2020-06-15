package mini;

public class Turn {
	private int mark;
	private int x;
	private int y;
	private Player player;
	private Board board;
	private Cell cell;

	public Turn (Player nowPlayer) {
		
		this.player = nowPlayer;
		}
	
	public void turnStart(Board board) {		
		this.cell = player.setCoordinates(board);
		
		board.checkWin();
			if(board.checkWin() == true) {
				board.showBoard();
				System.out.println("勝者:" + player);
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
