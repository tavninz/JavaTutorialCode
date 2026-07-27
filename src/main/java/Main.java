public class Main {
    public static void main(String[] args) {

        CreditCardPayment cred1 = new CreditCardPayment(300);
        cred1.processPayment();
        cred1.printRecept();
        System.out.println("\n");
        QRPayment q1 = new QRPayment(400);
        q1.processPayment();
        q1.printRecept();

    }
}

// Abstract Class , Abstract Method
abstract class Payment{
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    abstract void processPayment();
    public void printRecept(){
        System.out.println("Payment successfully. amount : "+ amount);
    };
}
class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("Payment processing from credit Card.");
    }
}

class QRPayment extends Payment {
    public QRPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("QR Code payment processing.");
    }
}