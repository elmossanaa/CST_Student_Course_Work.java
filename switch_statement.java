import java.util.Scanner;
public class Switch_statement {

    public static void main(String[] args) {
        int num;
        Scanner user_input = new Scanner(System.in);
        System.out.println("enter 10 , 20, or 30: ");
        num = user_input.nextInt();
        
        switch(num){
            case 10:
                System.out.println("you entered 10");
                break;
            case 20:
                System.out.println("you entered 20");
                break;
            case 30:
                System.out.println("you entered 30");
                break;
            default:
                System.out.println("Invalid Response!");
        }
        
    }
}
