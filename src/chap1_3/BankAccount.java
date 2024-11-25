package chap1_3;

public class BankAccount {
    // 일반 속성
    int accountNumber;
    String owner;

    // 상태속성
    int balance;

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
        }
    }
    void displayBalance(){
        System.out.println(balance);
    }
    BankAccount(String ownerName) {
        owner = ownerName;
    }
}
