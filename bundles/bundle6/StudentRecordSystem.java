class Student{

    private int rollNumber,marks;
    private String name;

    Student(int rollNumber,String name,int marks){
        this.rollNumber=rollNumber;
        this.name=name;
        setMarks(marks);
    }

        public void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Enter correct marks");
        }
    }
    public int getMarks(){
        return marks;
    }


    private String getGrade(){
        if(marks>=90)
            return "A";
        else if(marks>=75)
            return "B";
        else if(marks>=60)
            return "C";
        else
            return "Fail";
    }

    public void displayStudent(){

        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Name : "+name);
        System.out.println("Marks : "+getMarks());
        System.out.println("Grade : "+getGrade());

    }


}
public class StudentRecordSystem {
    public static void main(String[] args) {

        Student student=new Student(174,"Tharun",75);

        student.displayStudent();

        
    }
}
