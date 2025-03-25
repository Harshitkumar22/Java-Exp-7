interface Wallet{   // Interface of Wallet
    void addFunds(double amount);
    boolean spendFunds(double amount);
}

class DigitalWallet implements Wallet{  // Concrete class implementing Wallet
    private double balance; 

    public DigitalWallet(double initialBalance){
        this.balance=initialBalance;
    }

    @Override
    public void addFunds(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Added rs" + amount + " to wallet. New Balance: rs" + balance);
        }else{
            System.out.println("Invalid amount. Cannot add negative or zero funds.");
        }
    }

    @Override
    public boolean spendFunds(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Spent rs" + amount + ". Remaining Balance: rs" + balance);
            return true;
        }else{
            System.out.println("Transaction failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class WalletTest{
    public static void main(String[] args){
        DigitalWallet myWallet = new DigitalWallet(1000.0); // Initial balance: ₹1000

        myWallet.addFunds(500.0);    
        myWallet.spendFunds(300.0);   
        myWallet.spendFunds(1500.0);  
        myWallet.addFunds(-200.0);    // Attempting to add a negative amount (fail)

        // Trying to access balance directly (uncommenting the next line will cause a compilation error)
         //myWallet.balance = 5000; // Error: balance is private

        System.out.println("Final Balance: rs" + myWallet.getBalance());   // Printing final balance using getter method
    }
}
