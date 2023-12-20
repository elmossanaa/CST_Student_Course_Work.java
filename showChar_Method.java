import java.util.Scanner;

public class showChar_Method {

    public static void main(String[] args) {
       /** Write a method named showChar. The method should accept two arguments: a reference to 
a String object and an integer. The integer argument is a character position within the 
String, with the first character being at position 0. When the method executes, it should 
display the character at that character position. Here is an example of a call to the method:
showChar("New York", 2);
In this call, the method will display the character w because it is in position 2. Demonstrate 
the method in a complete program **/

     String text;
     Scanner user = new Scanner(System.in);
     int c = 0;
     
        System.out.println("Type any line of text you're thinking currently: ");
        text = user.nextLine();
        
        System.out.println("Enter the integer argument for the position within your text: ");
        c = user.nextInt();
       showChar(text, c);
    
    }
    public static void showChar(String text, int c){
        
        System.out.println(text.charAt(c));
    }
    
}
