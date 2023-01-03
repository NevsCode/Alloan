
package allloan;

import java.util.Scanner;

public class AllLoan {
    
    static int LIMIT = 1;
    static int counter= 0;
    public static void main(String[] args) {
        
        Scanner userinput = new Scanner(System.in);
        String loans_Type = "";
        int loans = 1;
        
        String[] firstname = new String[loans];
        String[] lastName = new String[loans];
        String[] loanNumber = new String[loans];
        String[] idNumber = new String[loans];
        double[] loanAmount = new double[loans];
       
        String greeting = "welcome to fnb service";
        System.out.println(greeting.toUpperCase());
        
       while(!loans_Type.equalsIgnoreCase("X") )
       {
          
           System.out.println("please choose what type of loan you will love to take:\n(H) for Home loan"
           + "\n(V)for vehicle loan\n(P)for home information " + "\n(x) to exit");
           loans_Type = userinput.nextLine(); 
           switch(loans_Type)
           {
                case "h":
                    HomeLoan(firstname,lastName,loanNumber,loanAmount,idNumber);
                    counter += 1;
                   break;
                case "v":
                    VehicleLoan(firstname,lastName,loanNumber,loanAmount,idNumber);
                    counter += 1;
                   break;
                case "p":
                    PrintInvoice print = new PrintInvoice(firstname,lastName,loanNumber,loanAmount,idNumber);
                    System.out.println("");
                    print.setRate();
                    print.setValues();
                    System.out.println("");
                    break;
                default:
                    if(!loans_Type.equalsIgnoreCase("x"))
                    {
                        System.out.println("invalid input");
                    }
            }
       }
       System.out.println("you have end the application");
    }
    
    public static void HomeLoan(String[] firstname ,String[] lastName, String[] loanNumber,double[] loanAmount ,String[] idNumber )
    {
        Scanner userinput = new Scanner(System.in);
        HomeLoan home = new HomeLoan(firstname,lastName,loanNumber ,loanAmount ,idNumber);
        System.out.println("HOME LOAN");
        System.out.println("----------");
        System.out.println("*****************************************");
        
        for(int f = 0; f < LIMIT ;f++)
        {
            System.out.print("Enter customer name >> ");
            firstname[f] = userinput.nextLine();
          
        }
        
        for(int l = 0; l < LIMIT ;l++)
        {
            System.out.print("Enter customer surname >> ");
            lastName[l] = userinput.nextLine();
        }
        
        for(int n = 0; n < LIMIT ;n++)
        {
            System.out.print("Enter customer loan number >> ");
            loanNumber[n] = userinput.nextLine();
        }
        
        for(int a = 0; a < LIMIT ;a++)
        {
            System.out.print("Enter customer loan Amount >> ");
            loanAmount[a] = userinput.nextDouble();
            
            if(loanAmount[a] <= 40000000)
            {
                System.out.println("accept");
            }
            else
            {
                System.out.println("the amount you it above the average");
                System.out.print("Enter customer loan Amount >> ");
                loanAmount[a] = userinput.nextDouble();
            }
        }
        
        for(int i = 0; i < LIMIT ;i++)
        {
            System.out.print("Enter customer ID number >> ");
            idNumber[i] = userinput.next();
        }
        
        home.setValues();
        home.setRate();
        System.out.println("**********************************************");
        
    }
    
    public static void VehicleLoan(String[] firstname ,String[] lastName, String[] loanNumber,double[] loanAmount ,String[] idNumber)
    {
        VehicleLoan vwhicle = new VehicleLoan(firstname,lastName,loanNumber ,loanAmount ,idNumber);
        Scanner userinput = new Scanner(System.in);
        System.out.println("VEHICLE LOAN");
        System.out.println("------------");
        System.out.println("**********************************************");
        for(int f = 0; f < firstname.length ;f++)
        {
            System.out.print("Enter customer name >> ");
            firstname[f] = userinput.nextLine();
          
        }
        
        for(int l = 0; l < LIMIT ;l++)
        {
            System.out.print("Enter customer surname >> ");
            lastName[l] = userinput.nextLine();
        }
        
        for(int l = 0; l < LIMIT ;l++)
        {
            System.out.print("Enter customer loan number >> ");
            loanNumber[l] = userinput.nextLine();
        }
        
        for(int l = 0; l < LIMIT ;l++)
        {
            System.out.print("Enter customer loan Amount >> ");
            loanAmount[l] = userinput.nextDouble();
            
            if(loanAmount[l] <= 40000000)
            {
                System.out.println("accept");
            }
            else
            {
                System.out.println("the amount you it above the average");
                System.out.print("Enter customer loan Amount >> ");
                loanAmount[l] = userinput.nextDouble();
            }
        }
        
        for(int i = 0; i < LIMIT ;i++)
        {
            System.out.print("Enter customer ID number >> ");
            idNumber[i] = userinput.next();
        }
        
        vwhicle.setValues();
        vwhicle.setRate();
        System.out.println("**********************************************");
        
    }
    
}
