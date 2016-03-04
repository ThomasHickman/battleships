import Battleships.GameEngine;
import Battleships.HumanPlayer;
import Battleships.Player;

public class main {

	public static void main(String[] args) {
		Player player1 = new HumanPlayer("player 1");
		Player player2 = new HumanPlayer("player 2");
		
		GameEngine ge = new GameEngine(player1, player2);
		
	}

}
