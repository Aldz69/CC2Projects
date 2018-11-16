package Calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        int num1;
        int num2;
           String operation;
           Scanner input = new Scanner(System.in);
           System.out.println("Enter first number");
           num1 = input.nextInt();
           System.out.println("Enter second number");
           num2 = input.nextInt();
               
           Scanner op = new Scanner(System.in);

        System.out.println("Please enter arithmetic operation");
         operation = input.next();

        if (operation.equals ("+")){
            System.out.println("your answer is" + (num1 + num2));
        }else if  (operation .equals ("-")){
            System.out.println("your answer is" + (num1 - num2));
        }else if (operation .equals ("/")){
            System.out.println("your answer is" + (num1 / num2));
        }else if (operation .equals ("*")){
            System.out.println("your answer is" + (num1 * num2));
        }else if (operation.equals("%")){
            System.out.println("your answer is" + (num1 % num2));
        }
           
    }
    
}
