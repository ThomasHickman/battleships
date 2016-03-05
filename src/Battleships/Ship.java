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

    private int[] positionThatAreHit;

    public abstract String getName();

	public boolean tryHit(int x, int y){
		throw new NotImplementedException();
	}

    public String getShipCoordInfo(Coord coord){
        Coord[] positions = getPositions();
        for(int i = 0;i < positions.length;i++){
            Coord pos = positions[i];
            if(pos == coord){
                if(Arrays.asList(positionThatAreHit).contains(i)){
                    return "HIT";
                }
                else{
                    return "SHIP";
                }
            }
        }
        return "EMPTY";
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
        this.positionThatAreHit = new int[getOffsets().length];
	}

    public abstract char getCharRepr();
}