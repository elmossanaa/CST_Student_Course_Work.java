import java.util.Scanner;

public class Wordproblems {
    /**Write a program that uses nested loops to collect data and calculate the average rainfall 
over a period of years. First the program should ask for the number of years. The outer loop 
will iterate once for each year. The inner loop will iterate 12 times, once for each month. 
Each iteration of the inner loop will ask the user for the inches of rainfall for that month. 
After all iterations, the program should display the number of months, the total inches of 
rainfall, and the average rainfall per month for the entire period.
* 
Input Validation: Do not accept a number less than 1 for the number of years. Do not 
accept negative numbers for the monthly rainfall.**/

    public static void main(String[] args) {
        
       Scanner user = new Scanner(System.in);
       
       int rainfall = 0;
       int month =1;
       int years;
       int average;
       
       
       
        System.out.println("Enter the number of years to calculate the average of rainfall: ");
        years = user.nextInt();
        
        
        
     
       for(int r =0; r<=years;r++){
           if(years<=0){
            System.out.println("Invalid Input");
            break;
        }
        
        while(month<=12){
            
        System.out.println("Enter rainfall for month " + month);
        rainfall += user.nextInt();
         month++; 
        
        }
        average = rainfall/12;
           System.out.println("The total inches of rainfall for year " + years + " is " +
                   rainfall);
           System.out.println("The average rainfall per month of year " + years + " is " 
                   + average);
           
       }
       
    }    
    }
        
