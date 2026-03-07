package bundles;
import java.util.Scanner;
public class SmartTemperaturAnalyser {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Temperature in Celcius");
     double temp=sc.nextDouble();
     System.out.println("Enter the Humidity percentage ");
     double Humidity=sc.nextDouble();
     System.out.println("Enter the windspeed in Km/hr");
     int windspeed=sc.nextInt();


     // conversion from Celcius to Fahrenhit
     // formula = (1C*9/5)+32
    System.out.println("Temperate :"+temp);
    double fahrenhit=(temp*(double)9/5)+32;
    System.out.println("Converted :"+fahrenhit);
    if(temp<10)
    {
         System.out.println("Category:Cold");
         if(windspeed>40 ||temp <5)
        System.out.println("Weather Warning");
            
        
    }
       
    else if(temp>=10 && temp<=25)
        System.out.println("Category:Moderate");
    else {
        System.out.println("Category:Hot");
         if(Humidity>80 && temp>30)
        System.out.println("Heat Alert");

            
    }
        

   
   
   }

}
