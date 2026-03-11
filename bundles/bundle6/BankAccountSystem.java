class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber,String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(int amount){
        if(amount>0)
            balance+=amount;
        else{
            System.out.println("Enter Valid amount");
            return;
        }
        System.out.println("Current balance after deposit of rupees"+amount+" : "+balance);
    }

    public void withdraw(int amount){
        if(amount<=balance)
            balance-=amount;
        else{
            System.out.println("insufficient balance");
            return;
        }
        System.out.println("Current balance after withdraw of rupees"+amount+" : "+balance);
    }

    public void setName(String name){
        accountHolder=name;
    }

    public double getBalance(){
        return balance;
    }



}
public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount obj=new BankAccount(1002,"Tharun",2500);

        obj.getBalance();

        obj.deposit(1200);

        obj.getBalance();

        obj.withdraw(1000);

        obj.getBalance();
    }
}