package chap1_3.practice;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount =new BankAccount();

        myAccount.deposit(5000);
        myAccount.withdraw(800);
        myAccount.displayBalance();

        myAccount.transfer(yourAccount, 3000);

        System.out.println("===나의잔액====");
        myAccount.displayBalance();

        System.out.println("====너의잔액===");
        yourAccount.displayBalance();
    }
}
