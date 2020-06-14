package mini;

import java.util.*;

public class Game {

	private Player firstPlayer;
	private Player secondPlayer;
	private Player nowPlayer = secondPlayer;
	private List<Turn> turns;
	
	public Game(){
		Player firstPlayer = new Player("first");
		Player secondPlayer = new Player("second");
		turns = new ArrayList<Turn>();
	}
	
	public void setPlayer(){
		if(nowPlayer == firstPlayer){
		this.nowPlayer = secondPlayer;
		}
		this.nowPlayer = firstPlayer;
	}
	
	public void gameStart(){
		for(Turn turn : turns) {//ターンごとにループする処理を設定したい
		Board board = new Board();
		board.showBoard();//Boardクラスで盤の表示をする仕組みを作っておく
		
		setPlayer();
		
		Turn turns = new Turn(nowPlayer);
		turns.turnStart();
		}
	}
		board.showBoard();
		
		System.out.println("＜ターン履歴＞");
		for(Turn turn : turns) {
				turn.showHistory();
		}
}