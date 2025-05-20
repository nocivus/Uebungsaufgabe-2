public class Main {

    public static void printGreeting(String name) {
        System.out.println("Hello " + name);
    }

    public static void calculate(int numOne, int numTwo, String operation) {
        if (operation.equals("sum")) {
            float result = numOne + numTwo;
            System.out.println(numOne + " + " + numTwo + " = " + result);
        }
        else if (operation.equals("difference")) {
            float result = numOne - numTwo;
            System.out.println(numOne + " - " + numTwo + " = " + result);
        }
        else if (operation.equals("product")) {
            float result = numOne * numTwo;
            System.out.println(numOne + " * " + numTwo + " = " + result);
        }
        else if (operation.equals("quotient")) {
            if (numTwo==0) {
                System.out.println("Teilen durch 0 nicht möglich");
            }
            else {
                float result = numOne / numTwo;
                System.out.println(numOne + " / " + numTwo + " = " + result);
            }
        }
        else {
            System.out.println("Unbekannte Operation");
        }
    }

    public static double calculatePerimeter(double sideLength){
        if (sideLength<0){
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = sideLength * 4;
        System.out.println("Der Umfang von einem Quadrat mit der Kantenlänge "+sideLength+" beträgt "+perimeter);
        return perimeter;
    }

    public static double calculatePerimeter(double sideLength1, double sideLength2){
        if (sideLength1<0 || sideLength2<0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = 2*sideLength1+2*sideLength2;
        System.out.println("Der Umfang von einem Rechteck mit den Kantenlängen "+sideLength1+" & "+sideLength2+" beträgt "+perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        printGreeting("Tom");

        calculate(1,1,"sum");
        calculate(8,3,"difference");
        calculate(3,2,"product");
        calculate(7,2,"quotient");
        calculate(7,0,"quotient");
        calculate(1,1,"exponent");

        calculatePerimeter(2);
        calculatePerimeter(2,3);
        calculatePerimeter(-1,4);

    }
}
