class StrengthChecker{

    String password="";
    boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;

    StrengthChecker(String password){
        this.password=password;
    }

    public void checkinngStrength(){

        if(password.length()<8){
            System.out.println("week password");
            return;
        }

        for(int i=0;i<password.length();i++){
            
            char ch=password.charAt(i);

            if(Character.isUpperCase(ch))
                hasUpper=true;
            else if(Character.isLowerCase(ch))
                hasLower=true;
            else if(Character.isDigit(ch))
                hasDigit=true;
            else 
                hasSpecial=true;
        }

        if(hasDigit&&hasLower&&hasSpecial)
            System.out.println("strong password");
        else 
            System.out.println("weak password");
       
    }
}
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        
        StrengthChecker obj1=new StrengthChecker("Thar@123");

        obj1.checkinngStrength();
        
    }
}
