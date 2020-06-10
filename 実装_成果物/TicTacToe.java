package mini;

public class TicTacToe {
		
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
			game.setCoordinates(1,1);
			game.setCoordinates(2,2);
			game.setCoordinates(3,3);
			game.checkWin();
			show3mark();
		}
	private void checkWin() {
	}
	private void setCoordinates(int x, int y) {
	}
	private static void show3mark() {
		System.out.println("3つ並びました");
	}
}