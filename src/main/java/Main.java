public class Main {
    public static void main(String[] args) {
        SmartPOS machine1 = new SmartPOS();
        machine1.CreditCard();

        SmartPOS machine2 = new SmartPOS();
        machine2.QRPayway();

        PaymentMethod method1 = new PaymentMethod();
        method1.ABAPayWay();

        PaymentMethod method2 = new PaymentMethod();
        method2.AClidaPayWay();
    }
}

interface CreditCardPayment{
    void CreditCard();
}

interface QRPayment {
    void QRPayway();
}

class SmartPOS implements CreditCardPayment, QRPayment {
    @Override
    public void CreditCard() {
        System.out.println("Payment from Credit Card is processing.");
    }

    @Override
    public void QRPayway() {
        System.out.println("KHQR code now is processing.");
    }
}

interface ABABankPayment {
    void ABAPayWay();
}

interface AClidaBankPayment {
    void AClidaPayWay();
}

interface MayBankPayment {
    void MaybankPayWay();
}

class PaymentMethod implements ABABankPayment,AClidaBankPayment,MayBankPayment{
    @Override
    public void ABAPayWay() {
        System.out.println("ABA Payment is processing.");
    }

    @Override
    public void AClidaPayWay() {
        System.out.println("AClida Payment is processing.");
    }

    @Override
    public void MaybankPayWay() {
        System.out.println("Maybank Payment is processing.");
    }
}