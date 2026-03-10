class Employee{

    String firstName,lastName,Company,email;
    Employee(String firstName,String lastName,String Company){
        this.firstName=firstName;
        this.lastName=lastName;
        this.Company=Company;
    }

    public void generateMail(){
        
        StringBuilder sb =new StringBuilder();
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        Company=Company.toLowerCase();
        sb.append(firstName);
        sb.append(".");
        sb.append(lastName);
        sb.append("@");
        sb.append(Company);
        sb.append(".com");
        email=sb.toString();
    }

    public void displayMail(){
        System.out.println(email);
    }
}

public class EmailGenerator{
    public static void main(String[] args) {
        
        Employee obj1=new Employee("Tharun","VNIAS","Vision");
        Employee obj2=new Employee("Rahul","Sharma","Google");
        Employee obj3=new Employee("Supreeth","ML","Salesforce");
        obj1.generateMail();
        obj1.displayMail();

        obj2.generateMail();
        obj2.displayMail();

        obj3.generateMail();;
        obj3.displayMail();
        

    }
}