package HareAndTortoise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RaceSimulatorTest{
    private RaceCourse raceCourse;
    private Hare hare;
    private Tortoise ijapa;

    @BeforeEach
    public void setUp(){
        raceCourse = new RaceCourse();
        hare = new Hare();
        ijapa = new Tortoise();
    }

    @Test
    public void getRaceTrack(){
        Assertions.assertNotNull(raceCourse.getRaceTrack());
    }
    @Test
    public void createRaceTrackWithSmallTrack(){
        int[] smallTrack = new int[20];
        raceCourse = new RaceCourse(smallTrack);
        Assertions.assertNotNull(raceCourse.getRaceTrack());
        Assertions.assertTrue(raceCourse.getRaceTrack().length > 70);
    }

    @Test
    public void checkAnimalAtStartPosition(){
        assertEquals(1, hare.getPosition());
       // assertEquals(1,ijapa.getPosition());
    }

    @Test
    public void generateNumberGreaterZero(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        Assertions.assertTrue(moveNumber >BigDecimal.ZERO.intValue());
            }

            @Test
            public void generateNumber(){
                int moveNumber = RaceSimulator.generateMoveNumber();
                Assertions.assertTrue(moveNumber >BigDecimal.ZERO.intValue());
                Assertions.assertTrue(moveNumber < 11);}

    @Test
    public  void ijapaFlatPlod(){
        int ijapaPosition  = ijapa.move(AnimalMovement.SLIP);
        assertEquals(1, ijapaPosition);

   }

   @Test
    public void ijapaSlip(){
        ijapa.setPosition(16);
        int ijapaPosition =ijapa.move(AnimalMovement.SLIP);
        assertEquals(10, ijapaPosition);
   }
@Test
    public void ijapaSlipFromLowPosition(){
    ijapa.setPosition(2);
    int ijapaPosition=ijapa.move(AnimalMovement.SLIP);
    assertEquals(1,ijapaPosition);
}

    @Test
    public void ijapaSlipFromLowPosition(){
        ijapa.setPosition(2);
        int ijapaPosition=ijapa.move(AnimalMovement.SLIP);
        assertEquals(1,ijapaPosition);
    }