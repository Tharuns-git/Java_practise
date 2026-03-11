class Employee{

    private int employeeId;
    private double salary;
    private String name;

    Employee(int employeeId,String name, double salary){
        setEmployeeId(employeeId);
        setEmployeeName(name);
        setSalary(salary);
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }

    public void setEmployeeName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("salary cannot be negative");
        }
        
    }

    public int getEmployeeId(){
        return employeeId;
    }

     public String getEmployeeName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void increaseSalary(double percent){


        if(percent <= 0){
            System.out.println("Invalid percentage");
            return;
        }

        else{
            salary=salary+((salary/100)*percent);
            System.out.println("Salary increased by "+percent+"%  : "+salary);
        }
    }

    public void displayEmployee(){
         System.out.println("----------------------------------");
         System.out.println("           EMPLOYEE DETAILS        ");
          System.out.println("----------------------------------");
        System.out.println("Employee ID : "+getEmployeeId());
        System.out.println("Employee Name: "+getEmployeeName());
        System.out.println("Salary : "+getSalary());
        System.out.println("----------------------------------");
    }



}
public class EmployeeSalarySystem {
    public static void main(String[] args) {

        Employee e1=new Employee(101,"Rahul",15_000);

        e1.displayEmployee();

        e1.increaseSalary(10);

        
        
    }
}
