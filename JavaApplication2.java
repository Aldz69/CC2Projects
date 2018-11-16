/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author cc2_1h-12
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner c = new Scanner (System.in);
  
        System.out.println("What is your course");
        String course = c.nextLine();
        
        if (course.equalsIgnoreCase("BSIT")){
        System.out.println("What is your track?");
        String track = c.nextLine();
         if (track.equals("WEBTECH")) {
        System.out.println("WEB AND TECHNOLOGY");
         }else if (track.equals("NETSEC")) {
        System.out.println("NETWORK AND SECURITY");
         }else if (track.equals("DA")) {
        System.out.println("DATA ANALYCTICS");
         } else if(track.equals("ERP")) {
             System.out.println("Enterprise and Resource Planning");
         }
        } else if (course.equalsIgnoreCase("comsci")) {
         System.out.println("What is your track?");
        String track = c.nextLine();
             if (track.equals("MOBDEV")){
            System.out.println("MOBILE DEVELOPMWNT");
            
            } else if (track.equals("Dig.Art")) {
                System.out.println("Digital Arts");
            } else if (track.equals("Anim")) {
                System.out.println("Animation");
            }           

     } else if(course.equalsIgnoreCase("bsda")){
            System.out.println("BSDA");
    }else{
            System.out.println("Invalid");
     
     }
    }
    
}
