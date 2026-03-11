public class ArrayIndexExceptionHandler {
    public static void main(String[] args) {
        int arr[]={10,12,15,14,45};
        
        try{
            int index=10;
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid valid Index : "+e.getMessage());
        }
    }
}
