package mini;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner s = new Scanner (System.in);
		int x = 0;
		int y = 0;
		
		do {
		System.out.println("座標を入力してください");
		x = s.nextInt();
		y = s.nextInt();
		board.setCoordinates(x, y);
		} while (board.checkArea(x, y));
	}
}
