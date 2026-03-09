import java.util.Scanner;

class Student {

    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public int calculateAverage() {
        return calculateTotal() / marks.length;
    }
}

public class ClassroomMarksManager {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Rahul", new int[]{95, 90, 82, 81, 75});
        students[1] = new Student("Tharun", new int[]{91, 72, 92, 67, 97});
        students[2] = new Student("Vinay", new int[]{85, 83, 89, 92, 95});
        students[3] = new Student("Abhi", new int[]{72, 76, 79, 71, 68});
        students[4] = new Student("Naveen", new int[]{61, 58, 59, 72, 92});

        int highestAverage = 0;
        String topper = "";

        for (Student s : students) {

            System.out.print(s.name + " Marks: ");

            for (int mark : s.marks) {
                System.out.print(mark + " ");
            }

            int avg = s.calculateAverage();
            System.out.println(" Average: " + avg);

            if (avg > highestAverage) {
                highestAverage = avg;
                topper = s.name;
            }
        }

        System.out.println("\nTopper: " + topper + " with average " + highestAverage);
    }
}