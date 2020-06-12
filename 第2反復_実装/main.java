package mini;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner s = new Scanner (System.in);
		int x = 0, y = 0;
		boolean winResult = false;
		
		do {
			boolean result = false;
			
			do {
			System.out.println("座標を入力してください。");
			String input = s.nextLine();
			String[] number = input.split(" ");
			
			x = Integer.parseInt(number[0]);
			y = Integer.parseInt(number[1]);
			result = board.setCoordinates(x, y);
			}while (result == false);
			
			winResult = board.checkWin();
		}while (winResult == false);
		show3mark();
	}
	private static void show3mark() {
		
	}
}