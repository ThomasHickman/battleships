package Ships;

import Battleships.Coord;
import Battleships.Oriantation;
import Battleships.Ship;

public class Hovercraft extends Ship{
	Hovercraft(Coord position, Oriantation orinataion) {
		super(position, orinataion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "hovercraft";
	}

	@Override
	protected Coord[] getOffsets() {
		// TODO Auto-generated method stub
		return new Coord[]{
			new Coord(0, 0),
			new Coord(0, 1),
			new Coord(1, 1),
			new Coord(1, 2),
			new Coord(2, 0),
			new Coord(2, 1),
		};
	}
}
