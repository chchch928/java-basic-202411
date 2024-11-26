package chap1_3.practice;

public class BankAccount {
    // 일반 속성
    String accountNumber;
    String owner;

    // 상태속성
    double balance;

    // 기능
    void deposit (double amount) {
        balance += amount;
    }
    void withdraw (double amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("잔액부족");
            return;
        }
    }
    void displayBalance(){
        System.out.println(balance);
    }
    void transfer(BankAccount takenAccount, int amount) {
        balance -= amount;
        takenAccount.balance += amount;
    }

}
