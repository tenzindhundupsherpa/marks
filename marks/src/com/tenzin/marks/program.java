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
        Scanner input = new Scanner(System.in);
        try{
        String[] names = {"Tenzin", "Pasang", "Dhundup", "Namgyal", "Ramesh", "Hari", "Ram"};
        while(true){
            System.out.println("Enter your id:");
        int i=input.nextInt();
        System.out.println(names[i]);
        System.out.println("Are you " + names[i] + " ?");
        if(input.next().equalsIgnoreCase("n")){
            System.out.println("wrong id");
            
        }else 
            break;
        }
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
            
        String[] subject = {"English", "Nepali", "C.Math", "Science", "Economics", "geometry"};

        Marks marks = new Marks(subject, input);
        marks.getMarks();

        if (marks.isFail()) {
            System.out.println("you are fail");
        } else {
            System.out.println(marks.getPercentage());
        }

        System.out.println(marks.getDivision());

    }

}
