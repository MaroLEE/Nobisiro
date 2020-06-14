package mini;

import java.util.*;

public class Game {

	private Player first;
	private Player second;
	private Player nowPlayer;
	private Board board;
	private List<Turn> turns;

	public Game(){
		this.first = new Player("先攻");
		this.second = new Player("後攻");
		this.nowPlayer = second;
		turns = new ArrayList<Turn>();
	}
	
	public void gameStart(){
		Board board = new Board();
		board.showBoard;
		setPlayer();
		Turn turn = new Turn(nowPlayer);
		turn.turnStart();
		this.turns.add(turn);
		board.showBoard;
		System.out.println("＜ターン履歴＞");
		for(Turn turn : turns) {
			turn.showHistory();
		}
	}
	public void setPlayer(){
		if(nowPlayer == first){
		this.nowPlayer = second;
		}
		this.nowPlayer = first;
	}
}