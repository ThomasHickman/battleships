package Battleships;
import static java.lang.System.out;

public class GameEngine {
	
	private BattleshipsBoard player1Board;
	private BattleshipsBoard player2Board;
	
	private Player[] players;
	private BattleshipsBoard[] playerBoards;
	
	public GameEngine(Player player1, Player player2){
		players = new Player[2];
		players[0] = player1;
		players[1] = player2;
		
		playerBoards = new BattleshipsBoard[2];
		playerBoards[0] = players[0].getBoard();
		playerBoards[1] = players[1].getBoard();
		
		int currentPlayerI = 0;
		
		while(true){
			Coord playerMove = players[currentPlayerI].makeMove();
			boolean playerMoveSuccess = playerBoards[1 - currentPlayerI /*other player*/].tryHit(playerMove);
			players[currentPlayerI].onTryHit(true, playerMove, playerMoveSuccess);
			players[1 - currentPlayerI].onTryHit(false, playerMove, playerMoveSuccess);
			
			if(playerBoards[currentPlayerI].hasShipsLeft()){
				out.print("Player " + (currentPlayerI + 1) + " won");
			}
			
			currentPlayerI = 1 - currentPlayerI;
		}
	}
}
