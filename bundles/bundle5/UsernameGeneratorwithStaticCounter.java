class Account {

    String name;
    String username;

    static int accountCount = 0;

    Account(String name) {
        this.name = name;
    }

    public void generateUsername() {

        name = name.toLowerCase();

        int length = Math.min(3, name.length());

        StringBuilder sb = new StringBuilder();

        accountCount++;

        sb.append(name, 0, length);
        sb.append(accountCount);

        username = sb.toString();
    }

    public void display() {
        
        System.out.println(username);
    }
}

public class UsernameGeneratorwithStaticCounter {

    public static void main(String[] args) {

        Account obj1 = new Account("Tharun");
        Account obj2 = new Account("Supreeth");
        Account obj3 = new Account("Rahul");

        obj1.generateUsername();
        obj2.generateUsername();
        obj3.generateUsername();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}