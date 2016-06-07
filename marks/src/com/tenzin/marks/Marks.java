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
public class Marks {
     int fullMarks=100;
     int passMarks=32;
     boolean isFail=false;
     double obtainedTotal=0;
     double[] marks;
     String[] subject;
     Scanner input;
     
     //constructor
     public Marks(String[] subject,Scanner input){
          marks=new double[subject.length];
          this.subject=subject;
          this.input=input;
     }
     
    public void getMarks(){
        for(int i=0;i<marks.length;i++){
         System.out.println("Enter Marks for " + subject[i] + ":");
         marks[i]=input.nextInt();
         obtainedTotal +=marks[i];
    }
    }
        public boolean isFail(){
            for(int i=0;i<marks.length;i++){
             if(marks[i]<passMarks){
             return true;
             }
            }
            return false;
        }
           public double getPercentage(){
               return(obtainedTotal/(fullMarks*marks.length)*100);
        
    }   
         public String getDivision(){
             double per=getPercentage();
             if(per>=80){
                 return "Distinction";
             }
             else if(per>=60&&per<80){
                 return "First Division";
             }
             else if(per>=45&&per<60){
                 return "Scond Division";
             }
             else if(per>=32&&per<45){
                 return "Third Division";
             }
             else 
                 return "fail";
         }
         
            
}
