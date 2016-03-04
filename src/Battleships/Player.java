package Battleships;
public interface Player {
	public BattleshipsBoard getBoard();
	
	public Coord makeMove();
	
	public void onTryHit(boolean isMe, Coord moveTried, boolean hasHit);
}
