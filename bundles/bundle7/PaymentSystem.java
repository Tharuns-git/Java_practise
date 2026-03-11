class Payment{
    protected double amount;

    Payment(double amount){
        this.amount=amount;
    }

    public void pay(){
        System.out.println("payed successfully!");
    }
}
class CreditCard extends Payment{

    CreditCard(double amount){
        super(amount);
    }
     public void pay(){
        System.out.println("The amount of $ "+amount+" payed using CreditCard");

    }
}

class UPI extends Payment{

    UPI(double amount){
        super(amount);
    }
     public void pay(){
        System.out.println("The amount of $ "+amount+" payed using UPI");
    }
}
class NetBanking extends Payment{

    NetBanking(double amount){
        super(amount);
    }
     public void pay(){
        System.out.println("The amount of $ "+amount+" payed using NetBanking");

    }
}
public class PaymentSystem {
    public static void main(String[] args) {

        Payment []payment={new CreditCard(5000),new UPI(2500),new NetBanking(1200)};
        
        for(Payment p:payment){
            p.pay();
        }
        
        //upcasting
        Payment p=new CreditCard(14000);
        CreditCard c=(CreditCard)p;

        p.pay();
        c.pay();
        
    }
}
