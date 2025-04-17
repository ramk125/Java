interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}

public class InterfaceMultiple {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        payment1.pay(100.50);

        Payment payment2 = new PayPal();
        payment2.pay(45.75);
    }
}
