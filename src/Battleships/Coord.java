package Battleships;

public class Coord{
	public int x;
	public int y;
	
	public boolean isInSquare(Coord topLeft, Coord bottomRight){
		return x >= topLeft.x
			&& x <= bottomRight.x 
			&& y >= topLeft.y
			&& y <= bottomRight.y;
	}

    public Coord(int x, int y){
        this.x = x;
		this.y = y;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord)) return false;

        Coord coord = (Coord) o;

        return x == coord.x && y == coord.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
