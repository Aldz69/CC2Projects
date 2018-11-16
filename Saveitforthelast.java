/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveitforthelast;

import java.util.Scanner;

/**
 *
 * @author CC2_1H-12
 */
public class Saveitforthelast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();

        String[][] names = new String[row][column];
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print("Column: " + (i + 1) + "row: " + (j + 1) + " : ");
                names[i][j] = input.next();
            }
        }

        System.out.println("  ");
        System.out.println("My Table: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
