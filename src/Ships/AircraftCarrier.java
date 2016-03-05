package Ships;

import Battleships.Coord;
import Battleships.Ship;

public class AircraftCarrier extends Ship {

	AircraftCarrier(Coord position, Orientation orientation) {
		super(position, orientation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Aircraft carrier";
	}

	@Override
	protected Coord[] getOffsets() {
		// TODO Auto-generated method stub
		return new Coord[]{
			new Coord(0, 0),
			new Coord(1, 0),
			new Coord(2, 0),
			new Coord(1, 1),
			new Coord(1, 2),
			new Coord(1, 3)
		};
	}
}