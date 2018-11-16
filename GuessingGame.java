
package guessinggame;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) { 
        
        
        
        Scanner keyboard = new Scanner (System.in);
        int number;
        int secretNumber;
        System.out.println("Enter your number");
        secretNumber = keyboard.nextInt();
        if (secretNumber%2 ==0){
               System.out.println("The number is even");
        }else {
               System.out.println("The number is odd");
        }
       do {
           System.out.println("Enter your desired number");
           number = keyboard.nextInt();
        System.out.println("Your  number is " + number);
        
        if (number == secretNumber){
            System.out.println("Your  number is correct. Congratulation!");
        }else if ( number < secretNumber)
            System.out.println("Higher!");
        else if (number> secretNumber){
            System.out.println("Lesser!!");
        }
        if ((number > 1000) &&(number < 0) ){
        System.out.println("Invalid Number!");
               
        }
       } while (number != secretNumber);
       
       
        
   
     
    }
}

