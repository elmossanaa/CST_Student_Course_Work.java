import javax.swing.JOptionPane;

public class JOptionpane_string_into_num {

    public static void main(String[] args) {
        String inputString;
        String name;
        int hours;
        double payrate;
        double grosspay;
        name = JOptionPane.showInputDialog("Enter your name");
        inputString = JOptionPane.showInputDialog("Enter how many hours you worked this week: ");
        //Converting user String into a Integer
        hours = Integer.parseInt(inputString);
        //needing hourly pay from user
        inputString = JOptionPane.showInputDialog("Enter your hourly pay rate");
        payrate = Double.parseDouble(inputString);
        
        //calculate grosspay
        grosspay = hours*payrate;
        
        JOptionPane.showMessageDialog(null, "Hello " + name + " your grosspay is " + grosspay);
        System.exit(0);
    }
}
