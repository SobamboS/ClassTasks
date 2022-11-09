package HareAndTortoise;

import java.math.BigDecimal;

public class Tortoise extends Animal{

    @Override
    public int move(AnimalMovement movement){
        int newPosition=BigDecimal.ZERO.intValue();
        if(movement.equals(AnimalMovement.FAST_PLOD)){
             newPosition += 3;
            this.setPosition(newPosition);
        }else if(movement.equals(AnimalMovement.SLIP)){
             newPosition -= 6;
            newPosition=newPosition<1 ? 1 : newPosition;
            this.setPosition(newPosition);
        }else if(movement.equals(AnimalMovement.SLIP)){
            int newPosition=getPosition() - 6;
            newPosition=newPosition<1 ? 1 : newPosition;
            this.setPosition(newPosition);
            return this.getPosition();
        }
    }
}