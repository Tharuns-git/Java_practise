class User {

    String firstName;
    String lastName;
    String userName;
    int birthYear;

    static int userCount = 0;

    User(String fname, String lname, int year) {
        firstName = fname;
        lastName = lname;
        birthYear = year;
    }

    public void generateUserName() {

        firstName = firstName.toLowerCase().trim();
        lastName = lastName.toLowerCase().trim();

        int year = birthYear % 100;

        StringBuilder sb = new StringBuilder();

        sb.append(firstName);
        sb.append(".");
        sb.append(lastName);
        sb.append(String.format("%02d", year));

        userName = sb.toString();

        userCount++;
    }

    public void display() {
        System.out.println("Username: " + userName);
    }

    public static void displayUserCount() {
        System.out.println("Total users created: " + userCount);
    }
}

public class UserNameGenerator {

    public static void main(String[] args) {

        User u1 = new User("Tharun", "V N", 2005);
        User u2 = new User("Rahul", "Sharma", 2002);

        u1.generateUserName();
        u2.generateUserName();

        u1.display();
        u2.display();

        User.displayUserCount();
    }
}