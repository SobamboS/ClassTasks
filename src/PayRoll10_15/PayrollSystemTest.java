package PayRoll10_15;

public class PayrollSystemTest {
    public static void main ( String[] args ) {
        SalariedEmployee salariedEmployee = new SalariedEmployee ( "John", "Smith",
                " 23890-9834", 800.00 );
        HourlyEmployee hourlyEmployee = new HourlyEmployee ( "Karen",
                "Felix", "243-245-245", 45.5, 45 );
        CommissionEmployee commissionEmployee = new CommissionEmployee ( "Sobambo", "Olusola",
                "423-345-567", 1000, 0.06 );
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee ( "Don", "Millie", "456-234-456",
                500, 0.40, 300 );
        PieceWorker pieceWorker = new PieceWorker ( "Saliu", "Montego",
                "454-124-312", 59.65, 500 );


        System.out.println ( "Employees processed individually:" );

        System.out.printf ( "%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings ( ) );
        System.out.printf ( "%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings ( ) );
        System.out.printf ( "%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings ( ) );
        System.out.printf ( "%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings ( ) );
        System.out.printf ( "%n%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings ( ) );

        Employee[] employees = new Employee[5];
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf ( "Employees processed polymorphically:%n%n" );

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println ( ); // invokes toString

// determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee ) {
                // downcast Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary ( 1.10 * employee.getBaseSalary ( ) );

                System.out.printf ( "new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary ( ) );
            }

            System.out.printf ( "earned $%,.2f%n%n", currentEmployee.earnings ( ) );
        }
        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf ( "Employee %d is a %s%n", j,
                    employees[j].getClass ( ).getName ( ) );
        }
    }
}