package mini;

public class Board {
	private int size = 3;
	private Cell[][] ll = new Cell[size][size];
	public Cell[] cells = new Cell[9];
	public Line[] lines = new Line[8];

	public Board() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				Cell cell = new Cell(x, y);
				ll[x][y] = cell;
			}
		}

		int count = 0;
		{
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					cells[count] = ll[i][j];
					count++;

				}
			}
			createline();
		}
	}

	public boolean checkArea(int x, int y) {
		boolean k = false;
		if (0 < x && x < 4) {
			if (0 < y && y < 4) {
				k = true;
			}
		}
		return k;
	}

	public boolean setCoordinates(int x, int y) {

		boolean areaResult = false;
		areaResult = checkArea(x, y);
		if (areaResult == false) {
			System.out.println("1から3の数字を入力してください");
			return false;
		}
		int markResult;
		markResult = ll[x - 1][y - 1].getMark();
		if (markResult == 0 || markResult == 1) {
			System.out.println("既にマークが置かれています");
			return false;
		}
		ll[x - 1][y - 1].setMark(0);// 第二反復では０と１の場合わけをする。

		return true;

	}

	public void createline() {
		// 横のLineを生成する(lines[0~2])
		lines[0] = new Line(cells[0], cells[1], cells[2]);
		lines[1] = new Line(cells[3], cells[4], cells[5]);
		lines[2] = new Line(cells[6], cells[7], cells[8]);

		// 縦のLineを生成する(lines[3~5])
		lines[3] = new Line(cells[0], cells[3], cells[6]);
		lines[4] = new Line(cells[1], cells[4], cells[7]);
		lines[5] = new Line(cells[2], cells[5], cells[8]);

		// 斜めのLineを生成する(lines[6, 7])
		lines[6] = new Line(cells[0], cells[4], cells[8]);
		lines[7] = new Line(cells[2], cells[4], cells[6]);
	}

	public boolean checkWin() {
		boolean lineResult = false;
		boolean winResult = false;
		for (int i = 0; i < lines.length; i++) {
			lineResult = lines[i].checkLine();
			if (lineResult == true) {
				winResult = true;
				break;

			}

		}
		return winResult;

	}
}
