package bundles.bundle2;
import java.util.Scanner;
public class NumberPatternAnalyzer {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n=sc.nextInt();

        int sum=0;
        int evencount=0;
        int oddcount=0;
       

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            sum+=i;
            if(i%2==0){
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
        }
        System.out.println();

         System.out.print("Divisible by 3 and 5: ");

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        System.out.println("Even Count : "+evencount);
        System.out.println("Odd count : "+oddcount);
        System.out.println("Sum is "+sum);
    }
}
