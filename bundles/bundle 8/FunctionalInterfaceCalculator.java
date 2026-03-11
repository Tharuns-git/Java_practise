@FunctionalInterface
interface Calculator{

    int operate(int a,int b);
}
public class FunctionalInterfaceCalculator {
    public static void main(String[] args) {
        //lambda expression
        Calculator add=( a, b)->a+b;
        Calculator sub=(a,b)->a-b;
        Calculator mul=(a,b)->a*b;

        System.out.println("Additon : "+add.operate(5, 10));
        System.out.println( "Subtraction : "+sub.operate(10,4));
        System.out.println("Multiplication : "+mul.operate(4,5));
    }

}

