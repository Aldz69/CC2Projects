/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;
import java.util.ArrayList;
import java.util.Arrays;
public class mdasasd {
    public static void main(String[] args){
        
    int [] a = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};            
    ArrayList<Integer> odd = new ArrayList <Integer>();
    ArrayList<Integer> even = new ArrayList <Integer>();
    
    for (int i = 0;i<a.length;i++){
        if(a[i]%2==0){
            odd.add (a[i]);
        } else if (a [i] % 2!=0){
            even.add(a[i]);
        }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("ODD/tEVEN");
        for (int r = 0; r < 5; r++){
            System.out.println(odd.get(r)+"/t"+even.get(r));
        }
        
        
    }
}
