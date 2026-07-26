public class Main {
    public static void main(String[] args) {

        smallResturaunt s1 = new smallResturaunt();
        s1.purchesOrder(300);
    }
}

class Resturaunt {
    public void purchesOrder(double amount){
        System.out.println("processing a purches order $" + amount);
    }
}

class smallResturaunt extends Resturaunt{
    @Override
    public void purchesOrder(double amount) {
        double fee = amount * 0.02;
        System.out.println("processing a purches order include fee $" + fee);
    }
}
