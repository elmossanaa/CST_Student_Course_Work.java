import java.util.Scanner;

//CST 1201 Assignment

public class Vehicle_Speed_calculator {
    
    /**The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time
* 
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 
120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the 
number of hours it has traveled. It should use a loop to display the distance a vehicle has 
traveled for each hour of a time period specified by the user. For example, if a vehicle is 
traveling at 40 mph for a three-hour time period, it should display a report similar to the 
one that follows:
* 
* 
* Hour --------Distance Traveled -----------------
1                        40
2                        80
3                       120
* 
* 
Input Validation: Do not accept a negative number for speed and do not accept any value 
less than 1 for time traveled.**/

    public static void main(String[] args) {
        
        int distance;
        int speed;
        int hour;
        
       Scanner driver = new Scanner(System.in);
       
        System.out.println("Please enter your vehicle speed (in mph) :) : ");
        speed = driver.nextInt();
        
        System.out.println("Please enter the number of hours your vehicle has travelled :) :");
        hour = driver.nextInt();
        
        distance = speed*hour;
        
        System.out.println("Hour\tDistance Travled(mph)");
        System.out.println("-------------------------------------------------------------");
        
        for(int car =1; car<=hour; car++){
            
            System.out.println(car +"\t" + (car*speed) );
        }
      
      
      
    }   
        }
