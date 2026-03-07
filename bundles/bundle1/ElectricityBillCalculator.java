package bundles;
import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        // creating Scanner object
        Scanner sc=new Scanner(System.in);

        // taking inputs in kwh
        System.out.println("Enter thee units consumed");
        int units=sc.nextInt();

        // Getting type of user
        System.out.println("Enter the Type of the User \n 1.Resedential  \n 2.Commercial");
        int Type=sc.nextInt();
        
        int bill=0;
       if(Type==1){
        if(units<=100)
            bill=units*2;
        else if(units<=300)
            bill =(100*2)+(units-100)*4;
        else 
            bill =(100*2)+200*4+(units-300)*6; 
        
       }
        else if(Type==2){
        if(units<=100)
            bill=units*5;
        else if(units<=300)
            bill =(100*5)+(units-100)*7;
        else
            bill =(100*5)+200*7+(units-300)*10; 
      
       }
       else 
        System.out.println("invalid Type");


       int totalBill=0;

       if(units<50)
        totalBill=bill-50;
       else if(units>500)
        totalBill=bill+(bill*10/100);
       else 
        totalBill=bill;


       

       System.out.println("Units consumed : "+units);
       System.out.println("Customer Type : "+Type);
       System.out.println("Bill : "+bill);
       System.out.println("Total bill : "+totalBill);

       if(bill>5000){
        System.out.println("High warning alert");
       }
    }

}
