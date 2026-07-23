import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Call Method
        MyFucntion();
        MyFucntion();
        MyFucntion();

        Main myObjMain = new Main();
        myObjMain.showInfo();

        displayInfo();
        displayInfo();
        displayInfo();

        DisplayName("Jonh Doe");
        DisplayInfor("Kakada",56);

        int sum = SumTwoNumber(5,2);
        System.out.println("\n");
        System.out.println(sum);

        double price = priceTotal(55,44);
        System.out.println("\n");
        System.out.println(price);

        System.out.println("\n");
        double[] monthlyPay = {240,400,243};
        System.out.println(Arrays.toString(monthlyPay));

        double[] yearlyPay = studentScholaship(monthlyPay,12);
        System.out.println(Arrays.toString(yearlyPay));



    }
    // 1- Method
    static void MyFucntion(){
        System.out.println("Hello World.");
    }

    // 2-Method Parameter
    static void DisplayName(String username){
        System.out.println("Greeting Mr " + username);
    }
    static void DisplayInfor(String name,int age){
        System.out.println("User: " + name + " Age: " + age);
    }

    // Method no Return Type
    void showInfo(){
        String username = "admin";
        System.out.println("You are " + username);
    }

    // Method no Return Type
    static void displayInfo(){
        String username = "admin";
        System.out.println("You are " + username);
    }

    // Method Return Type
    static int SumTwoNumber(int a,int b){
        return a + b;
    }

    static double priceTotal(double num1,double num2){
        return num1 * num2;
    }

    // Return Reference Type
    static double[] studentScholaship(double[] payout, int month){
        for(int i=0; i< payout.length; i++){
            payout[i] *= month;
        }
        return payout;
    }
}
