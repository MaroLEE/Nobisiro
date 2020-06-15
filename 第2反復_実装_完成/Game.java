package mini;

import java.util.*;

public class Game {

	private Player first;
	private Player second;
	private Player nowPlayer;
	private List<Turn> turns;
	private Board board;

	public Game(){
		this.first = new Player("先攻");
		this.second = new Player("後攻");
		this.nowPlayer = second;
		turns = new ArrayList<Turn>();
	}
	
	public void gameStart(){
		Board board = new Board();
		while(true) {
			board.showBoard();
			setPlayer();
			Turn turn = new Turn(nowPlayer);
			turn.turnStart(board);
			this.turns.add(turn);

			if(board.checkWin() == true) {
				board.showBoard();
				System.out.println("勝者:" + nowPlayer.getPlayer());
				break;
			}
			if(board.checkFull() == true) {
				board.showBoard();
				System.out.println("引き分け");
				break;
			}
		}

		System.out.println("<ターン履歴>");
		for(Turn turn1 : turns) {
			turn1.showHistory();
		}
	}
	
	public void setPlayer(){
		if(nowPlayer == first){
		this.nowPlayer = second;
		}else {
		this.nowPlayer = first;
		}
	}
}