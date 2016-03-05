package Battleships;

import Ships.Destoyer;
import Ships.Orientation;
import junit.framework.TestCase;
import java.util.Arrays;

/**
 * Created by Hickman on 04/03/2016.
 */
public class ShipTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testTryHit() throws Exception {
        assertTrue(Arrays.equals((new Destoyer(new Coord(1, 1), Orientation.EAST)).getPositions(),
                new Coord[]{new Coord(1, 1), new Coord(2, 1)}));
    }

    public void testIsSunk() throws Exception {

    }

    public void testGetPositions() throws Exception {

    }
}