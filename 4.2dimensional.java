/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayyy;

/**
 *
 * @author CC2_1H-12
 */
public class presss {

    public static void main(String[] args) {

        String a[][] = {
            {"ben", "luna"},
            {"tuko", "buko"},
            {"tsd", "luna"}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
