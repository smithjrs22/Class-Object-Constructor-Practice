public class Main {
    
    public static void main(String[] args)  {
        BankAccount newBankAcct = new BankAccount(500, "Tom");
        newBankAcct.deposit(100);
        newBankAcct.accountDetails();  
    }
}
