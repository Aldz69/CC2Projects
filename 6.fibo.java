/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayyy;
import java.util.Scanner;
/**
 *
 * @author CC2_1H-12
 */
public class Algo {
    
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
    System.out.print("Enter a number");
    int a=input.nextInt();
    
    for(int b=0; b<a+1;b++){
        System.out.print("f("+b+")\t");
    }
    System.out.println();
    
    for (int row = 0; row < a+1; row++) {
        for (int column=0; column<row+1; column++)
            System.out.print(fact(column)+"\t"); 
            }
    System.out.println();

}    
    
}
static int fact (int n) {
if (n<=1) {return n;}
else
{return fact(n-1) + fact(n-2); }

}

}
