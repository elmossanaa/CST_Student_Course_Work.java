import java.util.Scanner;

public class Switch_weather {

    public static void main(String[] args) {
       String input; 
      Scanner keyboard = new Scanner(System.in);
      System.out.println("enter the name of a season in lowercase: ");
      input = keyboard.nextLine();
      
      // Translate the season to Spanish
      switch(input){
          case "spring":
              System.out.println("The season where the tree grow leaves again!");
              break;
          case "summer":
              System.out.println("Stay hydrated!");
              break;
          case "fall":
              System.out.println("The season where it's fun to be outdoors!");
              break;
          case "winter":
              System.out.println("Stay warm!");
          
          }
      }
    }
