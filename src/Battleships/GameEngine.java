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
		playerBoards[0] = players[0].getInitalBoard();
		playerBoards[1] = players[1].getInitalBoard();
		
		int currentPlayerI = 0;
		
		while(true){
			Player currPlayer = players[currentPlayerI];
            Player oppPlayer = players[1 - currentPlayerI];
            Board currBoard = playerBoards[currentPlayerI];
            Board oppBoard = playerBoards[1 - currentPlayerI];

			Coord playerMove = currPlayer.makeMove();
			boolean playerMoveSuccess = oppBoard.tryHit(playerMove);
			currPlayer.onTryHit(true, playerMove, playerMoveSuccess);
            oppPlayer.onTryHit(false, playerMove, playerMoveSuccess);
			
			if(oppBoard.hasShipsLeft()){
				currPlayer.onWin();
                oppPlayer.onLose();
                return;
			}
			
			currentPlayerI = 1 - currentPlayerI;
		}
	}
}
