import javax.swing.JOptionPane;

public class String_format_Method {

    public static void main(String[] args) {
        
        double monthlypay = 6000.0;
        double annualpay = monthlypay * 12;
        String output = String.format("your anual pay is: %,.2f", annualpay);
        JOptionPane.showConfirmDialog(null, output);
        
        double monthlypay2 = 9000.125;
        JOptionPane.showConfirmDialog(null, String.format("Your"
                + " monthly pay is %,.2f",monthlypay2));
    }
}
