public class Convert {

    public static double calculate(double feet, double inches){
        if (feet < 0) {
            System.out.println("feet not valid " + feet);
            System.out.println("feet valid for => 0");
            return -1;
        }
        if (inches < 0 || inches > 12){
            System.out.println("inches not valid " + inches);
            System.out.println("inches valid for => 0 and <= 12");
            return -1;
        }

        double total = 0;
        double inchestocm = 0;
        double feettocm = 0;
        inchestocm = inches * 2.54;
        System.out.println( inches + " inches converted in cm = " + inchestocm);
        feettocm = feet * (2.54 * 12);
        System.out.println( feet + " feet converted in cm = " + feettocm);
        total = inchestocm + feettocm;


        return total;
    }

    public static double noRulesCalculate(double feet, double inches) {
        double total = 0;
        double inchestocm = 0;
        double feettocm = 0;
        inchestocm = inches * 2.54;
        System.out.println( inches + " inches converted in cm = " + inchestocm);
        feettocm = feet * (2.54 * 12);
        System.out.println( feet + " feet converted in cm = " + feettocm);
        total = inchestocm + feettocm;
        return total;
    }

    //    2 method with one parameter
    public static double calculate(int rawInches){
        if (rawInches < 0) {
            System.out.println("inches not valid " + rawInches);
            System.out.println("inhes valid for => 0");
            return -1;
        }
        System.out.println("rawinches passed = " + rawInches);

        double result = calculate(rawInches/12,rawInches%12);
        return result;

    }
}
