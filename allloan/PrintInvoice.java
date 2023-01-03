
package allloan;

import java.util.Scanner;

public class PrintInvoice extends Loan
{

    public PrintInvoice( String[] customer_firstName ,String[] customer_lastName,String[] loan_number, double[] loan_amount, String[] idNumber) {
        super(loan_number, customer_lastName, customer_firstName, loan_amount, idNumber);
        
        System.out.println("");
        int LIMIT = 1;
        for(int i =0 ; i < LIMIT;i++)
        {
            System.out.println("**************************");
            System.out.println("Details");
            System.out.println("--------");
            System.out.println("Your name:  " + customer_firstName[i] + "\nYour surname: " + customer_lastName[i] 
            + "\nYour loan number:  " + loan_number[i] + "\nYour loan amount: " + "R" + loan_amount[i] + "\nYour ID number: " + idNumber[i]); 
            
        }
        
    }

    @Override
    public void setValues() 
    {
       
        
        Scanner userinput = new Scanner(System.in);
        System.out.print("how will you like to pay for the loan enter:\n(s) for short-term\n(m) for medium-term\n(l)for long-term  >>");
        String loan_term = userinput.nextLine();
        if(loan_term.equalsIgnoreCase("s"))
        {
            System.out.println("short term: 1 year ");
            
        }else if(loan_term.equalsIgnoreCase("m"))
        {
            System.out.println("short term: 3 years ");
        }else if(loan_term.equalsIgnoreCase("l"))
        {
            System.out.println("short term:5 years ");
        }
    }

    @Override
    public void setRate() 
    {
        int[] interest_rate = {3};
        System.out.println("Interest rate: " + interest_rate[0] + " % ");
    }
    
}
