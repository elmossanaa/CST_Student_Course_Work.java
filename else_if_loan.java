import javax.swing.JOptionPane;
public class else_if_loan {

    public static void main(String[] args) {
        double salary;
        double years_on_job;
        String input;
        
        input = JOptionPane.showInputDialog("enter your annual salary");
        salary = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("enter years on current job: ");
        years_on_job = Double.parseDouble(input);
     
        if(salary>=30000){
            if(years_on_job>=2){
            JOptionPane.showMessageDialog(null, "Good news!You qualify for "
                    + "the loan.");
            }
            else{
                JOptionPane.showMessageDialog(null, "You need to be on your"
                        + " current job for at least two years to qualify.");
        }
        
    }
        else{
            JOptionPane.showMessageDialog(null, "You must earn " + "at least $30,000"
                    + " per year to qualify.");
        }
}
}
