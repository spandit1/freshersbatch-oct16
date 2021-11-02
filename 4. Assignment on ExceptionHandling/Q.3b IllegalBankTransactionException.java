package assignment4;

import java.util.Scanner;
public class IllegalBankTransactionException{
    static void fun() throws IllegalAccessException
    {
        double balance = 0, depositAmount, withdrawAmount;

        Scanner dep=new Scanner(System.in);
        System.out.println("Enter Deposit an amount");
        
        depositAmount =dep.nextInt();
        balance += depositAmount;

        Scanner wd=new Scanner(System.in);
        System.out.println("Enter Withdraw an amount ");
        
        withdrawAmount=wd.nextInt();
        balance -= withdrawAmount;


        if (withdrawAmount<-1){
            throw new IllegalAccessException();
        }
        else
            System.out.println("Sucessfully Withdrawl : "+withdrawAmount);
        System.out.println("Account Balance After Transaction: "+balance);
    }

    public static void main(String args[])
    {

        try {
            fun();
        }
        catch(IllegalAccessException e) {
            System.out.println(" WARNING :ILLEGAL BANK TRANSACTION EXCEPTION ");
        }
    }
}