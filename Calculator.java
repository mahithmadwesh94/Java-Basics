import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operation you want to perform: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "diff":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div":
                if(num2 == 0){
                    System.out.printf("%f should not be zero",num2);
                    break;
                }else{
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
               
                break;
            default:
                System.out.printf("%s operation is not supported", operation);
                break;
        }

        scanner.close();

    }
}