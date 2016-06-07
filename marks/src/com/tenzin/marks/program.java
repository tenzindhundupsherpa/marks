/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.marks;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     String[] subject={"English","Nepali","C.Math","Science","Economics","geometry"};
     
     Marks marks=new Marks(subject, input);
     marks.getMarks();
     
     if(marks.isFail()){
         System.out.println("you are fail");
     }
     else{
         System.out.println(marks.getPercentage());
     }
     
        System.out.println(marks.getDivision());
     

    }
    
}
