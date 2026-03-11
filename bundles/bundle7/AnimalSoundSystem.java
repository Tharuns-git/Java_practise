class Animal{

    protected String name;
    protected int age;

    Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void makeSound(){
        System.out.println("sounds");
    }
    public void display(){
    System.out.println("Name: " + name + " Age: " + age);
}
    

}
class Cat extends Animal{
    Cat(String name,int age){
        super(name, age);
    }
     public void makeSound(){
        System.out.println("Meow");
    }
    public void display(){
    System.out.println("Name: " + name + " Age: " + age);
}
}

class Dog extends Animal{
    Dog(String name,int age){
        super(name, age);
    }
     public void makeSound(){
        System.out.println("Bark");
    }
    public void display(){
    System.out.println("Name: " + name + " Age: " + age);
}
}

class Cow extends Animal{
    Cow(String name,int age){
        super(name, age);
    }
     public void makeSound(){
        System.out.println("Moo");
    }
    public void display(){
    System.out.println("Name: " + name + " Age: " + age);
}
}
public class AnimalSoundSystem {
    public static void main(String[] args) {

        Animal []animals={new Cat("Chintu", 5),new Dog("Ramu", 12),new Cow("Sam",9)};

        for(Animal A:animals){
            A.makeSound();
            A.makeSound();
        }
        //upcasting
        Animal a1=new Cat("Bash",8);
        //downcasting 
        Cat c=(Cat)  a1;
        
        a1.makeSound();
        c.makeSound();
    }
}
