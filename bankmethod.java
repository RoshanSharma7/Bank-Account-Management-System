public class bankmethod {
    String AccountHolderName;
    static double balance;

    public bankmethod(String AccountHolderName, double depositamount){
        this.AccountHolderName = AccountHolderName;
        this.balance = depositamount;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println(amount + " Deposit Sucessfully in your account.");
        }
        else{
            System.out.println("Invalid Operation are performe!");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && balance >= amount){
            balance = balance - amount;
            System.out.println(amount + " Withdraw Sucessfully from your account.");
        }
        else{
            System.out.println("Invalid Operation are performe!");
        }
    }

    public double getbelance(){
        return balance;
    }

    public String grtAccountHolderName(){
        return AccountHolderName;
    }
    
}
