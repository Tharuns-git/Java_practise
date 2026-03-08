package bundles.bundle2;

import java.util.Scanner;
public class ATMMachineSimulation {
    public static void main(String[] args) {
        
        int balance=5000;
        int choice=0;

        Scanner sc=new Scanner(System.in);

        while(choice!=4){
            System.out.println("Enter the choice");
            System.out.println("1. CheckBalance \n 2. Deposit \n 3. Withdraw \n 4. Exit ");
            choice =sc.nextInt();


            switch (choice) {

                case 1: System.out.println("Current Balance"+(balance)); 
                    break;
               
                case 2:System.out.println("Enter the deposit amount");
                 int deposit=sc.nextInt();
                if(deposit>0){
                    balance+=deposit;
                    System.out.println("Current balance :"+balance);
                }
                else
                    System.out.println("enter valid amount");
                    break;

                case 3:System.out.println("Enter withdraw amount");
                int withdraw=sc.nextInt();

                if(withdraw<=balance && withdraw %100==0){

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
                   

                     System.out.println("Transaction falied");
                }

                break;
                
                case 4:System.out.println("Exiting ATM"); 
                System.out.println("final Balance : "+balance);
                break;
                
                default:System.out.println("Invalid input");
                    break;
            }
        }
        sc.close();


    }
}
