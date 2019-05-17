import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter operator: ");
            String operator = input.nextLine();
        System.out.println("Enter FirstNumber: ");
            double number1 = input.nextDouble(); // incase of decimal place result
        System.out.println("Enter SecondNumber: ");
            double number2 = input.nextDouble();


        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double division = number1 / number2;
        double multiplication = number1 * number2;
        double modulus = number1 % number2;
        // double power = number1 ^ number2;

        switch (operator) { // 
            case "+":
            System.out.printf("Result: %s ", addition);
            break; // stop if + is the operator
            case "-":
            System.out.printf("Result: %s ", subtraction);
            break; // stop the process if - is the operator 
            case "/":
            System.out.printf("Result: %s ", division);
            break; //stop the process if / is the operator
            case "*":
            System.out.printf("Result: %s ", multiplication);
            break; //stop the process if * is the operator
            case "%":
            System.out.printf("Result: %s ", modulus);
            break; //stop the process if % is the operator
            default:
            System.out.println("Result:"+ " " + "error of operator"); // return error if operator is not recognised

        }
    } // end of class Maths

}