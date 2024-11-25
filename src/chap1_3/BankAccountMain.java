package chap1_3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount sponge = new BankAccount("Sponge");
        sponge.deposit(500);
        sponge.withdraw(800);
        sponge.displayBalance();


    }
}
