package Battleships;

import Ships.AircraftCarrier;

public abstract class Ship {
	static Class<Ship>[] getShips() {
        return (Class<Ship>[]) new Object[]{
                AircraftCarrier.class,
                Ships.Battleship.class,
                Ships.Cruiser.class,
                Ships.Destoyer.class,
                Ships.Hovercraft.class
        };
    }

	private int x;
	private int y;

	private Oriantation oriantation;

    public abstract String getName();

	public boolean tryHit(int x, int y){
		return false;
	}
	
	public boolean isSunk(){
		return true;
	}
	
	public Coord[] getPositions(){
		return null;
	}
	
	protected abstract Coord[] getOffsets();
	
	protected Ship(Coord position, Oriantation orinataion){
		
	}
}