import java.util.*;
public class BankingTransactionLedger{
    public static void main(String[] args) {

        long netBalance=0;
        
       int id1=1001;
       double amount1=1200;
       char type1='D';
       boolean status1=true;

       int id2=1002;
       double amount2=1200;
       char type2='D';
       boolean status2=false;

       int id3=1003;
       double amount3=110;
       char type3='W';
       boolean status3=true;

       int id4=1004;
       double amount4=510;
       char type4='W';
       boolean status4=true;

       int id5=1005;
       double amount5=300;
       char type5='D';
       boolean status5=true;

       long totalWithdrawals=0;
       long totalDeposits=0;
       float successPercentage=0;

       if(type1=='D'&& status1) totalDeposits+=amount1;
        if(type2=='D'&& status2) totalDeposits+=amount2;
        if(type3=='W'&&status3)  totalWithdrawals+=amount3;
         if(type4=='W'&& status4) totalWithdrawals+=amount4;
         if(type5=='D'&& status5) totalDeposits+=amount5;

        int successcount=0;
        if(status1)successcount++;
        if(status2)successcount++;    
        if(status3)successcount++;
        if(status4)successcount++;
        if(status5)successcount++;
    
       netBalance=totalDeposits-totalWithdrawals;
        successPercentage=(successcount/5.0f)*100;
        int truncatedAmount=(int) amount1;

        System.out.println("Amount as double: " + amount1);
        System.out.println("Amount as int: " + truncatedAmount);

        System.out.println("Total Deposits: " + totalDeposits);
        System.out.println("Total Withdrawals: " + totalWithdrawals);
        System.out.println("Net Balance: " + netBalance);
        System.out.println("Success %: " + successPercentage);

    }
}