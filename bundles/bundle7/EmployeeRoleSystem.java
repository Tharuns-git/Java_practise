class Employee{
    protected String name;
    protected double salary;

    Employee(String name,int salary){

        this.name=name;
        this.salary=salary;
    }
    public void calculateBonus(){

    }
    
}

class Manager extends Employee{
    
    Manager(String name,int salary){
        super(name, salary);
    }

    public void calculateBonus(){
        double bonus=(salary*20)/100;
        double totalSalary=salary+bonus;
        System.out.println("Total salary : "+totalSalary);
        
        
    }
}

class Developer extends Employee{
    
    Developer(String name,int salary){
        super(name, salary);
    }

    public void calculateBonus(){
        double bonus=(salary*10)/100;
        double totalSalary=salary+bonus;

        System.out.println("Total salary : "+totalSalary);
    }
}
class Tester extends Employee{
    
    Tester(String name,int salary){
        super(name, salary);
    }

    public void calculateBonus(){
        double bonus=(salary*5)/100;
        double totalSalary=salary+bonus;

        System.out.println("Total salary : "+totalSalary);
    }
}


public class EmployeeRoleSystem {
    public static void main(String[] args) {
        
        Employee[] staff={new Manager("Tharun",1_15_000),
                          new Developer("Supreeth",1_00_000),
                          new Tester("Vamsi",75_000)
        };

        for(Employee e:staff){

            e.calculateBonus();
        }

        //upcasting

        Employee staff1=new Manager("Uday", 1_00_000);

        staff1.calculateBonus();

        //downcasting
        Manager staff2=(Manager) staff1;

        staff2.calculateBonus();

       

    }
}
