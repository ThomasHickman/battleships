package Ships;

import Battleships.Coord;
import Common.Matrix2;

import java.util.Arrays;

public enum Orientation {
	NORTH   (new Matrix2(-1, 0, 0, 1)),
	SOUTH   (new Matrix2(1, 0, 0, 1)),
	EAST    (new Matrix2(0, 1, 1, 0)),
	WEST    (new Matrix2(1, 0, 0, 1));

    private final Matrix2 transform;

    public Coord[] applyTransform(Coord[] lst){
        Coord[] newArr = Arrays.copyOf(lst, lst.length);
        for(Coord el: newArr){
            int xCoord = el.x;
            int yCoord = el.y;
            el.x = xCoord * transform.values[0][0] + yCoord * transform.values[0][1];
            el.y = xCoord * transform.values[1][0] + yCoord * transform.values[1][1];
        }
        return newArr;
    }

    Orientation(Matrix2 transform){
        this.transform = transform;
    }
}
