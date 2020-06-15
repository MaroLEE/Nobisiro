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
	}
	
	public void showHistory() {
		System.out.print(player.getPlayer() + ":(" + (cell.getX()+1) + "," + (cell.getY()+1) + ") ");
		int mark = cell.getMark();
		if(mark == 0) {
			System.out.println("○");
		}
		else if(mark == 1) {
			System.out.println("×");
		}
	}

}
