package mini;

public class Turn2 {
	private int mark;
	private Player player;
	private Cell cell;

	public Turn2 (Player nowPlayer, int mark) {
		this.player = nowPlayer;
		this.mark = mark;
		}
	
	public void turnStart() {
		Board board = new Board();
		do {
		this.player.setCoodinates();

		if(board.checkWin() == true) {
			board.showBoard();
			System.out.println("勝者:" + player);
		}
		board.checkFull();
		}while(board.checkWin() == false && board.checkFull() == false);
	}
	
	public void showHistory() {
		System.out.print(player.getPlayer() + ":(" + cell.getX() + "," + cell.getY() + ") ");
		if(mark == 0) {
			System.out.println("○");
		}
		else if(mark == 1) {
			System.out.println("×");
		}
	}
}
