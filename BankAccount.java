public class BankAccount {

    // Member Variables / Attributes
    private double checking;
    private double savings;

    // Class Members (static)
    public static int numberOfAccounts = 0;
    public static double total = 0.0;

    // Constructor
    public BankAccount() {
        this.checking = 0.00;
        this.savings = 0.00;
        numberOfAccounts++;
    }

    // Getters
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }

    public double getTotal() {
        return total;
    }

    // Methods
    public void deposit(String account, double amount) {
        if(account == "checking"){
            this.checking += amount;
            total += amount;
        }else if(account == "savings"){
            this.savings += amount;
            total += amount;
        } else {
            System.out.println("Error!");
        }
        
    }

    public void withdraw(String account, double amount) {
        if(account == "checking") {
            if(this.checking >= amount){
                this.checking -= amount;
                total -= amount;
            } else {
                System.out.println("Insufficient funds!!!");
            }
        } else if(account == "savings") {
            if(this.savings >= amount){
                this.savings -= amount;
                total -= amount;
            } else {
                System.out.println("Insufficient funds!!!");
            }
        }
        
    }

}