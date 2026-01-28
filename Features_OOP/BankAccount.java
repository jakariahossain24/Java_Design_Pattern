public class BankAccount {
    private double balance;

    public void setBalance(double amount){
        if(amount>=0){
            this.balance=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance -=amount;
        }
    }
}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.setBalance(2000);
        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Balance: " + account.getBalance());
    }
} 
