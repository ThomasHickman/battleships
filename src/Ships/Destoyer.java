package Ships;

import Battleships.Coord;
import Battleships.Ship;

public class Destoyer extends Ship{
	public Destoyer(Coord position, Orientation orinataion) {
		super(position, orinataion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getCharRepr() {
		return 'D';
	}

	@Override
	public String getName() {
		return "destroyer";
	}

	@Override
	protected Coord[] getOffsets() {
		// TODO Auto-generated method stub
		return new Coord[]{
			new Coord(0, 0),
			new Coord(0, 1),
		};
	}
}
