package poly;

class PaymentMethod {
    private double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    protected void pay() {
        System.out.println("Processing a generic payment of " + getAmount());
    }

}

class CreditCard extends PaymentMethod {
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    protected void pay() {
        System.out.println("Paying $" + getAmount() + " using Credit card");
    }
}

class PayPal extends PaymentMethod {
    public PayPal(double amount) {
        super(amount);
    }

    @Override
    protected void pay() {
        System.out.println("Paying $" + getAmount() + " by PayPal account.");
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        PaymentMethod Payment;

        Payment = new PaymentMethod(1000);
        Payment.pay();

        System.out.println();

        Payment = new CreditCard(150);
        Payment.pay();

        System.out.println();

        Payment = new PayPal(220.20);
        Payment.pay();

    }
}
