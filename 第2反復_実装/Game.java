package mini;

public class Game {

	private Player first;
	private Player second;
	private Player nowPlayer = second;
	
	public Game(){
		this.first = new Player();
		this.second = new Player();
	}
	
	public void setPlayer(){
		if(nowPlayer == first){//countを使ったループが必要かも、スイッチケース文、ifとか
		this.nowPlayer = second;
		}
		this.nowPlayer = first;
	}
	
	public void gameStart(){
		for() {
		Board board = new Board();
		board.showBoard();//Boardクラスで盤の表示をする仕組みを作っておく
		
		setPlayer();
		
		Turn turn = new Turn(Player name);
		turn.turnStart()；
		}
		
		board.showBoard();
		
		for() {
			return turn.showHistory();
		}
	}
	
	
	
	
	
	
}
