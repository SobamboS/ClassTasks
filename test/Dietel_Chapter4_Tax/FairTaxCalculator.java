package Dietel_Chapter4_Tax;

public class FairTaxCalculator {
    private final double FAIR_TAX_RATE = 23.00;
    public double calculateTax(double price){
        return (FAIR_TAX_RATE/100) * price;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    private double totalPrice = 0.0;

    public  double CalculateTax(double price){
        return(0.23*price);

    }
    public double calculateTotalPrice ( double price ) {
        return totalPrice += price;
    }

}
