package MultiCurrencyMoney;

public class Dollar {

    public Dollar ( int amount ) {
        this.amount = amount;
    }

    public int amount;

    public Dollar times ( int multiplier ) {
        return new Dollar ( amount * multiplier );
    }

    public boolean equals ( Object object ) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}