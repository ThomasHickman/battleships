package Battleships;
public interface Player {
	BattleshipsBoard getInitalBoard();
	
	Coord makeMove();
	
	void onTryHit(boolean isMe, Coord moveTried, boolean hasHit);

	void onWin();

    void onLose();
}
