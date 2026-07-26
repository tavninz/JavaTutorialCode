class BankAccount{
    int accountNumber;
    String accountName;
    int firstbalance;

    private int accountBalance;

    //Constructor
    BankAccount(){
        accountNumber = 872034343;
        accountName = "Heatha Rom";
        firstbalance = 0;
    }

    // Constructor Parameter
    BankAccount(int accId,String name, int bal){
        this.accountNumber = accId;
        this.accountName = name;
        this.firstbalance = bal;
    }
}
public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(6283,"Sroch",5000);
    }
}
