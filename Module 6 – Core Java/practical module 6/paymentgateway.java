package core;
interface PaymentGateway {
    void pay(double amount);   // Abstract method
    void refund(double amount);
}

// Class implementing PaymentGateway for Credit Card
class CreditCardPayment implements PaymentGateway {
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

 
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }

   
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Credit Card: " + cardNumber);
    }
}

// Class implementing PaymentGateway for UPI
class UPIPayment implements PaymentGateway {
    String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

  
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI: " + upiId);
    }

   
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to UPI: " + upiId);
    }
}
public class paymentgateway {
	public static void main(String[] args) {
        // Using Credit Card
        PaymentGateway creditPayment = new CreditCardPayment("1234-5678-9012-3456");
        creditPayment.pay(150.75);
        creditPayment.refund(50.00);

        System.out.println();

        // Using UPI
        PaymentGateway upiPayment = new UPIPayment("khushi@upi");
        upiPayment.pay(200.00);
        upiPayment.refund(100.00);
    }
}

