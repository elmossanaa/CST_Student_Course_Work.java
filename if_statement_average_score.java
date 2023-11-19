import javax.swing.JOptionPane;

public class if_statement_average_score {

    public static void main(String[] args) {
        double s1;
        double s2;
        double s3;
        double average;
        String input;
        
        input = JOptionPane.showInputDialog("enter first score: ");
        s1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("enter second score: ");
        s2 = Double.parseDouble(input);
        JOptionPane.showInputDialog("enter third score: ");
        s3 = Double.parseDouble(input);
        
        average = (s1+s2+s3)/3;
        JOptionPane.showConfirmDialog(null, "average of test scores is " +average);
        
        if(average>=90)
            JOptionPane.showConfirmDialog(null,"Grade: A");
        
    }
}
