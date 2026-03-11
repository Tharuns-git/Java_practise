class ExceptionHandler{
    public void divisibleNumber(int a,int b){

        try{
            int result=a/b;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){   
            System.out.println("cannot divible by zero");

        }
        catch(Exception e){
            System.out.println("Failed");
        }
    }
    

}
public class SafeDivisionProgram{
    public static void main(String[] args) {

        ExceptionHandler obj=new ExceptionHandler();
        obj.divisibleNumber(10, 0);
        obj.divisibleNumber(10, 5);
        
    }
}