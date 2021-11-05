package Assignment2;

class Bank{
    void totalMoneyInBank() {
        System.out.println("The Employee incremented salary is :" );

    }
}

class SavingAcoount extends Bank {
    double fixedDeposits =20000;
    void totalMoneyInBank() {
        System.out.println("total money in savings account :" +(fixedDeposits));
    }
}

class CurrentAcccount extends SavingAcoount {
    double cashCredit=25000;
    void totalMoneyInBank() {
        System.out.println("The total money in current account "+(cashCredit));
    }
}

public class question3 {
    public static void main(String args[]) {

        CurrentAcccount c=new CurrentAcccount();
        SavingAcoount s=new SavingAcoount();


        c.totalMoneyInBank();
        s.totalMoneyInBank();

        System.out.println("Total money in the bank is " + (s.fixedDeposits + c.cashCredit));

    }
}