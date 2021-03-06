package mini;

public class Board {
	private int size = 3;
	private Cell[][] ll = new Cell[size][size];
	public Cell[] cells = new Cell[9];
	public Line[] lines = new Line[8];
	
	public Cell getCell(int x, int y) {
        this.ll[x][y] = ll[x][y];
        return ll[x][y];
    }

	
	public Board() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				Cell cell = new Cell(x,y);
				ll[x][y] = cell;
			}
		}
		
		int count = 0;{
			for(int i = 0; i < 3;i++) {
				for(int j = 0; j < 3; j++) {
					cells[count] = ll[i][j];
					count++;
					
				}
			}
			createline();
		}
	}	
//	範囲外チェック
	public boolean canPut(int x,int y) {
		if(checkArea(x,y) == true) {
			if(ll[x-1][y-1].getMark() != 2) {
				System.out.println("既に置かれています。");
	            return false;
	        }else {
	            return true;
	        }
		}else {
			System.out.println("1から3の数字を入力して下さい。");
			return false;
		}
	}


	public boolean checkArea(int x,int y) {
		boolean areaResult = false;
		if (0 < x && x <4) {
			if (0 < y && y <4) {
				areaResult=true;
			}
		}
		return areaResult;
	}
	
	
	public void createline() {
	//横のLineを生成する(lines[0~2])
			lines[0] = new Line(cells[0], cells[1], cells[2]);
			lines[1] = new Line(cells[3], cells[4], cells[5]);
			lines[2] = new Line(cells[6], cells[7], cells[8]);
	
			
			//縦のLineを生成する(lines[3~5])
			lines[3] = new Line(cells[0], cells[3], cells[6]);
			lines[4] = new Line(cells[1], cells[4], cells[7]);
			lines[5] = new Line(cells[2], cells[5], cells[8]);
			
			//斜めのLineを生成する(lines[6, 7])
			lines[6] = new Line(cells[0], cells[4], cells[8]);
			lines[7] = new Line(cells[2], cells[4], cells[6]);
		}
//		勝利判定
	public boolean checkWin() {
		boolean winResult = false;
		for(int i = 0; i < lines.length; i++) {
			if(lines[i].checkLine() == true) {
				winResult = true;
				break;
			}
		}
		return winResult;
	}
	
//		引き分け判定
	public boolean checkFull() {
		boolean fullResult = true;
		for(int i = 0; i<cells.length ; i++) {
			cells[i].getMark();
			if(cells[i].getMark() == 2) {
			fullResult=false;
			}else {
				fullResult = true;
				
			}
		}
		return fullResult;
	}
//		showBoard
	public void showBoard() {
		for(int i = 0; i < 3; i++) {
			System.out.println("-------");
			for(int j = 0; j < 7; j++) {
				if(j % 2 == 0) {
					System.out.print("|");
				}else {
					Cell cell = ll[j/2][i]; //変更済み
					if(cell.getMark() == 0) {
						System.out.print("○");
					}else if(cell.getMark() == 1) {
						System.out.print("×");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("-------");
	}
}
		