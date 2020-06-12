package mini;

import java.util.Scanner;

public class Player {

	private String name;
	private int mark;//新たな属性を追加

	public Player(String name) {//コンストラクタの引数を変更
		this.name = name;
		if(name == "first") {
			this.mark = 0;
		}	this.mark = 1;
	}
	public Cell setCoodinates() {
		Board board = new Board();
		Scanner s = new Scanner (System.in);
		int x = 0, y = 0;
		boolean putResult = false;
		do {
			System.out.println("列と行を、半角スペースで区切って入力してください(例：2列目の3行目 → 2 3)");
			String input = s.nextLine();
			String[] number = input.split(" ");
			
			x = Integer.parseInt(number[0]);
			y = Integer.parseInt(number[1]);
			putResult = board.canPut(x, y);
			}while (putResult == false);
		s.close();
		
		if(putResult == true) {
			Cell cell = new Cell(x,y);
			cell.setMark(mark);
			return cell;
		}
		return null;
	}
	public String getPlayer() {
		return this.name;
	}
}
