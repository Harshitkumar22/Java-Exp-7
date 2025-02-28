interface Wallet{   // Interface of Wallet
    void addFunds(double amount);
    boolean spendFunds(double amount);
}

class DigitalWallet implements Wallet{  // Concrete class implementing Wallet
    private double balance; // Private balance variable

    public DigitalWallet(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public void addFunds(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Added ₹" + amount + " to wallet. New Balance: ₹" + balance);
        } else{
            System.out.println("Invalid amount. Cannot add negative or zero funds.");
        }
    }

    @Override
    public boolean spendFunds(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Spent rs" + amount + ". Remaining Balance: rs" + balance);
            return true;
        } else{
            System.out.println("Transaction failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    // Getter method to check balance (optional)
    public double getBalance(){
        return balance;
    }
}

// Main class to test DigitalWallet
public class WalletTest {
    public static void main(String[] args) {
        // Creating a DigitalWallet object
        DigitalWallet myWallet = new DigitalWallet(1000.0); // Initial balance: ₹1000

        // Performing fund operations
        myWallet.addFunds(500.0);    
        myWallet.spendFunds(300.0);   
        myWallet.spendFunds(1500.0);  
        myWallet.addFunds(-200.0);    // Attempting to add a negative amount (should fail)

        // Trying to access balance directly (uncommenting the next line will cause a compilation error)
        // myWallet.balance = 5000; // Error: balance is private

        System.out.println("Final Balance: rs" + myWallet.getBalance());   // Printing final balance using getter method
    }
}
