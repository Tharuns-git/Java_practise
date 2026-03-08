import java.util.Scanner;

class BankAccount{
    final String accountNumber="06592310003118";
    String accountHolder="Tharun";
    int balance=10_000;
    public int deposit(int amount){
        return balance+=amount;
    }
    public void deposit(int amount,String note ){
        System.out.println("amount : "+amount+" "+note);
       balance+=amount;
       System.out.println("Current Balance : "+balance);
    }

    public int withdraw(int withdraw){
        if(withdraw > balance){
            System.out.println("Insufficient Balance");
            return balance;
        }
        balance -= withdraw;
        return balance;
    }
    public int checkBalance(){
        return balance;
    }

}
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        BankAccount obj=new BankAccount();
        int choice=0;

        while(choice!=4){
            System.out.println("Enter the choice \n1.depsoit \n2.withdraw \n3.checkBalance \n4.exit");
            choice=sc.nextInt();
            switch(choice){

                case 1:
                    System.out.println("Enter the amount to deposit");
                    int amount=sc.nextInt();

                    System.out.println("Add note? (yes/no)");
                    String ans=sc.next();

                    if(ans.equalsIgnoreCase("yes")){
                        System.out.println("Enter note:");
                        String note=sc.next();
                        obj.deposit(amount,note);
                    }else{
                        obj.deposit(amount);
                    }
                    break;

                case 2:System.out.println("Enter the withdraw amount : ");
                    int withdraw=sc.nextInt();
                    System.out.println("Balance after withdraw amount "+withdraw+" : "+obj.withdraw(withdraw));
                    break;
                    

                case 3:System.out.println("your current balance is : "+obj.checkBalance());
                    break;

                case 4: System.out.println("Atm Exiting ");
                    
                    break;
                
                default:System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
