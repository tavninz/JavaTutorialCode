class Bank {
    String accNumber = "028729462839723";
    double balance = 0;

    // 1-Method
    void Deposit(){
        System.out.println("Deposit Method to Account.");
    }

    // 2-Access Modifier(public,protected,private)

    public void DepositAccount(){
        System.out.println("Hello World");
    }

    protected void CheckBalance(){
        System.out.println("Hello World");
    }

    private void DepositNewBalance(){
        System.out.println("Hello World");
    }

    // 2-Type of Method
    // Non-Return Type(void)
    void checkBalance(){
        System.out.println("Hello World");
    }
    void sumTwoNumber(){
        int a = 3;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);
    }

    // Return-Type
    String Greeting(){
        return "Hello World";
    }

    int calTwoNumber(){
        return 3 + 5;
    }

    // Parameter / Arguments
    void GessInputNumber(int a){
        System.out.println(a);
    }
    void getTwoValue(int a, int b){
        System.out.println(a + b);
    }

    String registerStudent(String name){
        return "Hello " + name;
    }
    int calCulateStudentAge(int age, int year){
        int currentAge = year - age;
        return currentAge;
    }


    // Instance Method
    void AddMoreNumber(){
        System.out.println("Number was added.");
    }

    // Static Method
    static void BrandName(){
        System.out.println("Static Method Called.");
    }

}


public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.DepositAccount();
        b1.CheckBalance();
        // b1.DepositNewBalance(); Error

        b1.sumTwoNumber();

        //Return Function
        String gess1 = b1.Greeting();
        System.out.println(gess1);

        int getCalNum = b1.calTwoNumber();
        System.out.println(getCalNum);




        // call instance method
        b1.AddMoreNumber();

        // Static Method
        Bank.BrandName();
    }
}
