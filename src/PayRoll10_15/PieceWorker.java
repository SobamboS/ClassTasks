package PayRoll10_15;

public class PieceWorker extends Employee {

    private double wages;
    private double pieces;

    public PieceWorker ( String firstName, String lastName,
                         String socialSecurityNumber, double wages, double pieces ) {
        super ( firstName, lastName, socialSecurityNumber );
        this.wages = wages;
        this.pieces = pieces;
    }

    public double getWages(){
        return wages;
    }
    public double getPieces(){
        return pieces;
    }

    @Override
    public double earnings ( ) {
 return getWages() * getPieces();
    }

    @Override
    public String toString() {
        return String.format ( "PieceWorker employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString ( ), "hourly wage", getWages ( ),
                "hours worked", getPieces ( ));
    }
}