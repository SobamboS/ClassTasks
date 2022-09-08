package Dietel_Chapter4_Tax;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairTaxCalculationTest {
    private FairTaxCalculator fairTaxCalculator;
    @BeforeEach
    void startWithThis(){
        fairTaxCalculator = new FairTaxCalculator ();
    }


    @Test
    void testThatFairTaxCanBeCalculated(){
        //given
        Product product = new Product("milo", 100.00);
        //when
        double tax = fairTaxCalculator.calculateTax(product.getPrice());
        // assert
        assertEquals(23.00, tax);
    }
    @Test
    void testThatProductsTotalPriceCanBeCalculated(){
        // given
        fairTaxCalculator.setTotalPrice ( 50 );
        // when
        double totalPrice = fairTaxCalculator.calculateTotalPrice(30.00 );
        //assert
        assertEquals ( 80.00, totalPrice );

    }
}
