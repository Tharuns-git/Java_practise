import java.util.Scanner;
public class ATMWithdrawalSimulator {

    public static void main(String[] args) {
        final int ATM_PIN = 1234;
        int balance=2_50_000;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter withdraw Amount");
        int withdraw=sc.nextInt();

        System.out.println("Enter 4 digit   PIN ");
        int PIN=sc.nextInt();

        if(PIN==ATM_PIN){
            if(withdraw<=balance && withdraw %100==0 && withdraw <=20_000){
                System.out.println("Transaction Successful");
                balance-=withdraw;
                System.out.println("Withdraw amount is : "+withdraw);
                System.out.println("Remaining Balance is : "+balance);
            }
            else {
                if(withdraw>balance)
                    System.out.println("Insufficient balance");
                else if(withdraw%100!=0)
                    System.out.println("Enter amount in multiples of 100");
                else if(withdraw >20_000)
                    System.out.println("Over Transaction--> Reached your day Limit ");

            System.out.println("Transcation falied");
            }
        }
        else
            System.out.println("invalid PIN");
        

        sc.close();

    }
}
