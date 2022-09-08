//package Employee;
//
//public class HourlyEmployee extends Employee {
//    double hours;
//    double wages;
//    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
//                          double workedHours, double wagesPerHour) {
//        super(firstName, lastName, socialSecurityNumber);
//        this.hours = workedHours;
//        this.wages = wagesPerHour;
//
//        if ( wagesPerHour < 0.0 ) {
//            throw new IllegalArgumentException("Wages per hour must be Non Negative ");
//        }
//
//        if ( workedHours <= 0.0 || workedHours > 168 ) {
//            throw new IllegalArgumentException("You can't below 0.0 hours or above 168 hours per month ");
//        }
//    }
//
//    public void setWorkedHours(double workedHours) {
//        if ( workedHours <= 0.0 || workedHours > 168 ) {
//            throw new IllegalArgumentException("You can't below 0.0 hours or above 168 hours per month ");
//        }
//        this.hours = workedHours;
//    }
//
//    public double getWorkedHours() {
//        return hours;
//    }
//
//
//    public void setWagesPerHour(double wagesPerHour) {
//        if ( wagesPerHour < 0.0 ) {
//            throw new IllegalArgumentException("Wages per hour must be Non Negative ");
//        }
//        this.wages = wagesPerHour;
//    }
//
//    public double getWagesPerHour() {
//        return wages;
//    }
//
//    @Override
//    public double earnings() {
//        return getWorkedHours() * getWagesPerHour();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + getWagesPerHour() + getWorkedHours();
//    }
//
//}
//
