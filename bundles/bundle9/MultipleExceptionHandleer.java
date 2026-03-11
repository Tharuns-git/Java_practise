class Handler{
    public void divisibleNumber(int a,int b){

        try{
            int result=a/b;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){   
            System.out.println("cannot divible by zero : "+e.getMessage());

        }
        catch(Exception e){
            System.out.println("Failed");
        }
    }

    public void Array(int index){
        int arr[]={10,12,15,14,45};
        
        try{
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid valid Index : "+e.getMessage());
        }
          catch(Exception e){
            System.out.println("Failed");
        }

    }
    

}

public class MultipleExceptionHandleer {
    public static void main(String[] args) {
        Handler obj=new Handler();

        obj.Array(1);

        obj.Array(10);

        obj.divisibleNumber(10, 2);

        obj.divisibleNumber(10,0);

    }
    
}
