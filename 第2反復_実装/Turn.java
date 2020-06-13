package mini;

public class Turn {
	private Player player;
	private Cell cell;
	private int mark;
	
	private int x;
	private int y;

	public Turn (Player nowPlayer) {
		
	}
	
	public void turnStart() {
		cell.setCoordinates();
	
		Board.checkWin(){
		System.out.println()
		}
		Board.chekcFull(){
			
		}
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
