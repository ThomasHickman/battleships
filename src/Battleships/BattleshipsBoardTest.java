package Battleships;

import Ships.AircraftCarrier;
import Ships.Orientation;
import junit.framework.TestCase;

/**
 * Created by Thomas Hickman on 04/03/2016.
 */
public class BattleshipsBoardTest extends TestCase {
    BattleshipsBoard board = new BattleshipsBoard();


    public void setUp() throws Exception {
        super.setUp();
    }

    public void testTryInsertShip() throws Exception {
        assertFalse("wrong ships reported",
            board.tryInsertShip(new AircraftCarrier(new Coord(1, 1), Orientation.NORTH)));
        assertTrue("correct ships pass",
                board.tryInsertShip(new AircraftCarrier(new Coord(1, 1), Orientation.EAST)));
    }
}