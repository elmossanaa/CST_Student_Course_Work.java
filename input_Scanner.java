import java.util.Scanner;
/**
 *
 * @author selmo
 */
public class User_input {
  
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = keyboard.next();
        System.out.println("what is your age?");
        int age = keyboard.nextInt();
        System.out.println("what city are you located?");
        String city = keyboard.next();
        System.out.println("What state are you located in? "
                + "");
        String state = keyboard.next();
        System.out.println("What is your weight?");
        double weight = keyboard.nextDouble();
        System.out.println("your name is " + name + "\n Your age is " + age + "\nyour city is " 
           + city + "\nyour state is " + state + "\n your weight is " + weight );
        
    }
    
}
