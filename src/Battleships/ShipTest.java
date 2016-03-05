package Battleships;

import Ships.Orientation;
import junit.framework.TestCase;

/**
 * Created by Hickman on 04/03/2016.
 */
public class ShipTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testTryHit() throws Exception {
        assertTrue((new Ships.Destoyer(new Coord(1, 1), Orientation.EAST)).getPositions()
                == new Coord[]{new Coord(1, 1), new Coord(1, 2)});
    }

    public void testIsSunk() throws Exception {

    }

    public void testGetPositions() throws Exception {

    }
}