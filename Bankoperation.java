import java.util.Scanner;

public class Bankoperation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Case 1
        System.out.println("\n----------------- Welcome to Bank ------------------");
        System.out.print("\nEnter the Account Holder Name: ");
        String name = scn.nextLine(); 
        System.out.print("Enter the Inilial amount: ");
        double Inilialamount = scn.nextDouble();
        bankmethod account = new bankmethod(name, Inilialamount);
        System.out.println(account.grtAccountHolderName() +" Account created Sucessfully" + " with the RS "+ account.getbelance() + " Balance");

        // Case 2 deposite method
        System.out.println("\n-------------------------------------------");
        System.out.print("\nYou want to Deposite money? (Yes/no): ");
        scn.nextLine();
        String depositeans = scn.nextLine();
        if (depositeans.equalsIgnoreCase("yes")){
            System.out.print("Enter the deposite amount: ");
            double amount = scn.nextDouble();
            account.deposit(amount);
        }

        // Case 3 withdraw method
        System.out.println("\n-------------------------------------------");
        System.out.print("\nYou want to Withdraw money? (Yes/No): ");
        scn.nextLine();
        String withdrawans = scn.nextLine();
        if (withdrawans.equalsIgnoreCase("yes")){
            System.out.print("Enter the withdraw amount: ");
            double amount = scn.nextDouble();
            account.withdraw(amount);
        }

        // Case 4
        scn.nextLine();
        System.out.println("\n-------------------------------------------");
        System.out.print("\nYou want to check your balance? (Yes/No): ");
        //scn.nextLine();
        String checkans = scn.nextLine();
        if (checkans.equalsIgnoreCase("yes")){
            System.out.println("Your bank balance is: " + account.getbelance());
        }

        // Case 5
        System.out.println("\n-------------------------------------------");
        System.out.print("\nYou want to exit the project? (Yes/No): ");
        //scn.nextLine();
        String exitans = scn.nextLine();
        if (exitans.equalsIgnoreCase("yes")){
            System.out.println("Exiting....\nThank you for using this project\nGoodbye.");
        }else{
            System.out.println("Restart the project for performing more operation\nNOTE: you must create the new account, because privious account data are loss.\n");
        }

        scn.close();

    }
    
}

