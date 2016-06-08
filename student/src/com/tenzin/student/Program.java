/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.student;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] students = new String[10];
        int i = 0;
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1.Add student name:");
            System.out.println("2.delete student");
            System.out.println("3.Show all");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            System.out.println("Enter your choice(1-5)");

            int choice = input.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("Enter your name:");
                    String name=input.next();
                    students[i] = input.next();
                    i++;

                    System.out.println("Do you want to add more[Y/N]");
                    String select = input.next();
                    if (select.equalsIgnoreCase("n")) {
                        break;
                    }//if 
                }//while

            } //if
            else 
                if(choice==2){
                    System.out.println("Delete a student");
                }
                else if(choice==3){
                    System.out.println("Show all:");
                }else
                    if(choice==4){
                        System.out.println("Search");
                    }
                    else if(choice==5){
                        System.exit(0);
                    }
         } //while
        
    }

}
