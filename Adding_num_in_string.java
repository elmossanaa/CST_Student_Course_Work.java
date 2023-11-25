public class Adding_num_in_string {

    public static void main(String[] args) {
        double price1 = 12345.67;
        double price2 = 89012.34;
        System.out.printf("price 1  was %f for the day. The next day, the price will be "
                + "%f", price1,price2);
        double p = 1256.63;
        double o = 1456.34;
        
        System.out.printf("\n p is: \n%22.2f", p);
        System.out.printf("\no is: \n%25.2f",o);
        
        double nu1= 1.234;
        double nu2 = 12.345;
        double nu3 = 123.456;
        
     //displaying variables with leading zeros in a field of 9 spaces, rounded to 2 decimal places.
        System.out.printf("\n%09.2f", nu1);  
        System.out.printf("\n%09.2f", nu2);
        System.out.printf("\n%09.2f", nu3);
        
        
    int q1 = 456;
    int q2 = 12;
    int q3 = 45678;
    int q4 = 567;
   
     
    //display each variable left-justified in a field of 8 spaces.
    System.out.printf("\n%-8d%-8d\n", q1, q2);
    System.out.printf("\n%-8d%-8d\n", q3, q4);
    
    //Formatting string arguments
    String name1 = "Amanda";
    String name2 = "Sophie";
    System.out.printf("\n%10s%10s", name1,name2);
    
    String name3 = "Danielle";
    String name4 = "Jenna";
    System.out.printf("\n%-10s%-10s", name3,name4);
    
    //arguments with differnt data
    int hours =40;
    double pay = hours *25;
    String name5 = "Natalie";
        System.out.printf("\nName: %s, Hours: %d Pay: %,.2f", name5, hours,pay);
    
            
    }
}
