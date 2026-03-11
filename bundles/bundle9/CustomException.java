class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String str){
        super(str);
    }
}
class CustomExceptionHandler{

    public void withdraw(int withdraw){

        int balance=2500;

    try{
        if(withdraw<=balance){
            balance-=withdraw;
            System.out.println("Amount withdraw Successfully");
        }
        else
            throw new InsufficientBalanceException("Insufficent balance");
    }
    catch(InsufficientBalanceException e){
        System.out.println("Enter valid amount to withdraw : "+e.getMessage());
    }

    }
}
public class CustomException {
    public static void main(String[] args) {

        CustomExceptionHandler obj=new CustomExceptionHandler();
        
        obj.withdraw(2500);

        obj.withdraw(5000);
    }
}
