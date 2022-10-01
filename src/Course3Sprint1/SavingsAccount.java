package Course3Sprint1;

import java.util.Scanner;

public class SavingsAccount {

    String customerName;
    int customerAge;
    int accountNumber;
    double accountBalance;

    public void getCustomerDetails()

    {
        Scanner inputObj=new Scanner(System.in);
        System.out.println("Please enter customer name:");
        customerName=inputObj.next();
        System.out.println("Please enter customer age:");
        customerAge= inputObj.nextInt();
    }
}
