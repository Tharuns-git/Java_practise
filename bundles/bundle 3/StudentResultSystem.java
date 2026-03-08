import java.util.Scanner;

class Student{
    int rollnumber;
    int marks1;
    int marks2;
    int marks3;

    Student(int rollnumber,int marks1 , int marks2,int marks3){
    this.rollnumber=rollnumber;
    this.marks1=marks1;
    this.marks2=marks2;
    this.marks3=marks3;
    }
   

    public int CalculateTotal(){
       int total= marks1+marks2+marks3;
       return total;
    }
    public int CalculateAverage(int total){
        int average=total/3;
        return average;
    }

    public String grade(int average){
        if(average>90)
            return "A";
        else if(average>80)
            return "B";
        else if(average>65)
            return "C";
        else
          return "fail";
    }


}
public class StudentResultSystem {
    public static void main(String[] args) {

        int total=0;
        int average=0;
        String grade=null;
        
        Scanner sc=new Scanner(System.in);
        Student students[] = {
            new Student(174,95,98,96),
            new Student(175,92,86,92),
            new Student(176,85,91,97),
            new Student(177,86,92,89),
            new Student(178,82,81,49)
        };

        for(Student s:students){

            total = s.CalculateTotal();
            average = s.CalculateAverage(total);

            System.out.println("Total: "+total);
            System.out.println("Average: "+average);
            System.out.println("Grade: "+s.grade(average));
        }
    
    }
       
}
