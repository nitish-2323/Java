abstract class PaymentGateway {
    abstract void pay(int n);
}

class UpiPay extends PaymentGateway {
    void pay(int n) {
        System.out.println("You have sucessfully payment rupees: " + n);
    }
}

class Netbanking extends PaymentGateway {
    void pay(int n) {
        System.out.println("You have sucessfully payment rupees: " + n);
    }
}

class CreaditCard extends PaymentGateway {
    void pay(int n) {
        System.out.println("You have sucessfully payment rupees: " + n);
    }
}

class Factory {
    static PaymentGateway modeofPayment(String type) {
        if (type.equalsIgnoreCase("UPI")) {
            return new UpiPay();
        } else if (type.equalsIgnoreCase("Netbanking")) {
            return new Netbanking();
        } else if (type.equalsIgnoreCase("CreditCard")) {
            return new CreaditCard();
        } else {
            return null;
        }
    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        PaymentGateway obj = Factory.modeofPayment("UPI");
        if (obj != null) obj.pay(1000);

        PaymentGateway obj1 = Factory.modeofPayment("Netbanking");
        if (obj1 != null) obj1.pay(1030);

        PaymentGateway obj2 = Factory.modeofPayment("CreditCard");
        if (obj2 != null) obj2.pay(5000);
    }
}
