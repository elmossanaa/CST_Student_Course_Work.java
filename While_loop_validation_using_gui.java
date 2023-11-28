import javax.swing.JOptionPane;

public class While_loop_validation_using_gui {

    public static void main(String[] args) {
      String user;
      int num;
        user = JOptionPane.showInputDialog("Enter a number from 1-100");
        num = Integer.parseInt(input);
        while(num < 1 || num>100){
            user = JOptionPane.showInputDialog("Invalid Input" + "\nEnter a number from 1-100");
            num = Integer.parseInt(input);
        }
            
            
    }
}
