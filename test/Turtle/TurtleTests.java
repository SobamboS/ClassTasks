package Turtle;

import Turtle.TurtlePosition;
import Turtle.Turtles;
import org.junit.jupiter.api.*;
import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTests {
    private Turtles ijapa;

    @BeforeEach
    public void setThisUP(){
        ijapa = new Turtles();
    }

    @Test
    public void thereIsATurtle(){
        Turtles ijapa = new Turtles();
        assertNotNull(ijapa);
    }

    @Test
    public void testTurtleCanMovePenUp(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMovePenDown(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingSouth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveRight_whileFacingWest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveRight_whileFacingNorth(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingNorth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingWest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_WhileFacingSouth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMove(){
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        ijapa.move(3);
        assertEquals(new TurtlePosition(0,3), ijapa.getCurrentPosition());
    }

}
