public class Test {
    public static void main(String[] args) {

        BankAccount katieAccount = new BankAccount();

        katieAccount.deposit("checking", 100.00);
        System.out.printf("\n\nYour checking account balance is: $%s\n",katieAccount.getChecking());
        katieAccount.withdraw("checking", 30.00);
        System.out.printf("\nYour checking account balance is: $%s\n",katieAccount.getChecking());
        System.out.printf("\nYour total balance is: $%s\n", katieAccount.total);
        
    }
}