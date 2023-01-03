
package allloan;

import java.util.Scanner;

public class HomeLoan extends Loan  
{
    
    public HomeLoan(String loan_number[], String customer_lastName[], String customer_firstName[], double loan_amount[], String idNumber[]) 
    {
      super(loan_number, customer_lastName, customer_firstName, loan_amount,idNumber);
    }
    
    @Override
    public void setValues()
    {
        Scanner userinput = new Scanner(System.in);
        System.out.println("how will you like to pay for the loan enter:\n(s) for short-term\n(m) for medium-term\n(l)for long-term");
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
