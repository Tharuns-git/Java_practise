interface Payment{
    void pay(double amount);
}
class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using UPI");
    }
}

class NetBanking implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using NetBanking");
    }
}
public class OnlinePaymentGateway {
    public static void main(String[] args) {

        Payment payment[]={new CreditCard(),new UPI(),new NetBanking()};

        for(Payment p:payment){
            p.pay(5000);
        }

        
    }
}
