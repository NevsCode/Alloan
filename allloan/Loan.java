
package allloan;

public abstract class Loan {
    int LOANS = 1;
        
    String[] firstname ;
    String[] lastName ;
    String[] loanNumber ;
    String[] idNumber ;
    double[] loanAmount;
    double[] interestRate ;
    String[] term ;
    
    Loan(String loan_number[],String customer_lastName[],String customer_firstName[],double loan_amount[],String idNumber[])
    {
        loanAmount = new double[LOANS];
        firstname = new String[LOANS];
        lastName = new String[LOANS];
        loanNumber = new String[LOANS];
        idNumber = new String[LOANS];
        
    }
    
    public String getLoanNumbaer()
    {
        return loanNumber[LOANS];
    }
    
    public String getCustomerLastName()
    {
        return lastName[LOANS];
    }
    
    public String getCustomerFirstName()
    {
        return firstname[LOANS] ;
    }
    
    public double getloanAmount()
    {
        return loanAmount[LOANS];
    }
    
   
    public String getTerm()
    {
        return term[LOANS];
    }
    
    
    public String Idnumber()
    {
        return idNumber [LOANS];
    }
    
    public abstract void setValues();
    
    public abstract void setRate();
    
}
