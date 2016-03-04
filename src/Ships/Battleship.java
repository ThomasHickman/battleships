package Ships;

import Battleships.Coord;
import Battleships.Oriantation;
import Battleships.Ship;

public class Battleship extends Ship{
	Battleship(Coord position, Oriantation orinataion) {
		super(position, orinataion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Coord[] getOffsets() {
		// TODO Auto-generated method stub
		return new Coord[]{
			new Coord(0, 0),
			new Coord(0, 1),
			new Coord(0, 2),
			new Coord(0, 3)
		};
	}
}
