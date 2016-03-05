package Battleships;
import Ships.AircraftCarrier;
import Ships.Orientation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

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

	private Orientation orientation;
    private Coord position;

    public abstract String getName();

	public boolean tryHit(int x, int y){
		throw new NotImplementedException();
	}
	
	public boolean isSunk(){
		return true;
	}
	
	public Coord[] getPositions(){
        Coord[] retValue = orientation.applyTransform(getOffsets());
        for(Coord el: retValue){
            el.x += position.x;
            el.y += position.y;
        }
        return retValue;
	}
	
	protected abstract Coord[] getOffsets();
	
	protected Ship(Coord position, Orientation ordination){
        this.position = position;
        this.orientation = ordination;
	}
}