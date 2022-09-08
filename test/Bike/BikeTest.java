package Bike;

import Bike.Bike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BikeTest {
    private Bike bike;

    @BeforeEach
    void getStartWithThis ( ) {
        bike = new Bike ( );
    }

    @Test
    void bikeCanBeTurnedOnTest ( ) {
        assertFalse ( bike.isOn ( ) );

        bike.turnedOn ( );
        Assertions.assertTrue ( bike.isOn ( ) );
    }

    @Test
    void bikeCanBeTurnedOffTest ( ) {
        bike.turnedOn ( );

        bike.turnedOff ( );
        assertFalse ( bike.isOn ( ) );
    }

    @Test
    void bikeWillNotAccelerateWhenOffTest ( ) {
        assertFalse ( bike.isOn ( ) );
        assertEquals ( 0, bike.getSpeed ( ) );

        bike.increaseSpeed ( );
        assertEquals ( 0, bike.getSpeed ( ) );
    }

    @Test
    void bikeCanBeAcceleratedOnGearOneTest ( ) {
        bike.isOn ( );
        bike.turnedOn ( );
        assertEquals ( 0, bike.getSpeed ( ) );
        assertEquals ( 1, bike.getGear ( ) );

        bike.increaseSpeed ( );
        assertEquals ( 1, bike.getSpeed ( ) );
    }
    @Test
    void bikeCanChangeFromGearOneToGearTwoAutomatically ( ) {
        bike.isOn ( );
        bike.turnedOn ( );
        assertEquals ( 1, bike.getGear ( ) );
        for (int i = 0; i < 20; i++) {
            bike.increaseSpeed ( );
        }
        assertEquals ( 20, bike.getSpeed ( ) );
        assertEquals ( 1, bike.getGear ( ) );
        bike.increaseSpeed ( );
        assertEquals ( 2, bike.getGear ( ) );
        assertEquals ( 2, bike.getGear ( ) );
    }

    @Test
    void bikeCanAccelerateOnGearTwoTest ( ) {
        bike.isOn ( );
        bike.turnedOn ( );
        for (int i = 0; i < 21; i++) {
            bike.increaseSpeed ( );
        }
        assertEquals ( 2, bike.getGear ( ) );
        assertEquals ( 21, bike.getSpeed ( ) );

        bike.increaseSpeed ();
        bike.increaseSpeed();
        assertEquals ( 25, bike.getSpeed ( ) );
        assertEquals ( 2, bike.getGear ( ) );
    }
    @Test
    void bikeCanChangeFromGearTwoToGearThree(){
        bike.isOn();
        bike.turnedOn ();
        for(int i = 0; i < 25; i++){
            bike.increaseSpeed ();
        }
        assertEquals ( 29, bike.getSpeed () );
    assertEquals(2, bike.getGear());
    bike.increaseSpeed ();
    assertEquals ( 3, bike.getGear () );
    assertEquals ( 31, bike.getSpeed () );
    }


    @Test
    void bikeCanBeAcceleratedOnGearThreeTest() {
        bike.isOn ();
        bike.turnedOn ();
        for (int i = 0; i < 24; i++) {
            bike.increaseSpeed ( );
        }
        assertEquals ( 4, bike.getSpeed () );
        assertEquals ( 20, bike.getGear () );

        bike.increaseSpeed ();
        bike.increaseSpeed ();
        assertEquals ( 36, bike.getSpeed () );
        assertEquals ( 4, bike.getGear () );
    }

    @Test
 void bikeCanChangeFromGearThreeToGearFour(){
        bike.isOn ();
        bike.turnedOn ();
        for(int i = 0; i < 25; i++){
            bike.increaseSpeed ();
        }
        assertEquals(29, bike.getSpeed ());
        assertEquals ( 2, bike.getSpeed () );
        bike.increaseSpeed ();
        assertEquals ( 3, bike.getGear () );
        assertEquals ( 31, bike.getSpeed () );

    }




}
