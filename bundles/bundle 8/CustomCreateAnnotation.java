import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//this reflects 
@Retention(RetentionPolicy.RUNTIME)
//Annotation → metadata for classes/methods
@interface Number{
    int number();
}
//Applying annotation
@Number(number=8)
class Book{

}

public class CustomCreateAnnotation {
    public static void main(String[] args) {

    //accessing annotation by reflection
    Number a=Book.class.getAnnotation(Number.class);//meaning:-Get annotation attached to Book class
    System.out.println(a.number());
        
    }
}
