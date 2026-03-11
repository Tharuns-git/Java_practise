 class Vehicle{

    String brand;
    int speed;

    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void start(){
        System.out.println("starts with key on");

    }
    public void stop(){
        System.out.println("starts with key off");
    }
    public void display(){
        System.out.println("Inside vehicle");
    }
}

class Car extends Vehicle{

    Car(String brand, int speed) {
        super(brand, speed);
        //TODO Auto-generated constructor stub
    }
    public void start(){
        System.out.println("Car starting with key");
    }
    public void stop(){
        System.out.println("Car stops with key");
    }
     public void display(){
        System.out.println("Brand : "+brand+" : Speed : "+speed);
    }

}

class Bike extends Vehicle{

    Bike(String brand,int speed){
        super(brand, speed);
    }
    public void start(){
        System.out.println("Start with self");
    }
    public void stop(){
        System.out.println("want to put stand when we stop");
    }
    public void display(){
      System.out.println("Brand : "+brand+" : Speed : "+speed);
    }
    
}

class Truck extends Vehicle{

    Truck(String brand,int speed){
        super(brand, speed);
    }

    public void start(){
        System.out.println("Start with heavy engine");
    }
    public void stop(){
        System.out.println("Stops with heavy engine ");
    }
    public void display(){
        System.out.println("Brand : "+brand+" : Speed : "+speed);
    }
}

public class VehicleSystem{
    public static void main(String[] args) {

        Vehicle []v= {
            new Car("Benz",150),new Bike("RX-150",120),new Truck("BharatBenz", 220)};

            //priting that using for each
            for(Vehicle vehicles:v){
                vehicles.start();
                vehicles.stop();
                vehicles.display();
            }

        //for car class
        // v=new Car("hilux",170);
        // v.start();
        // v.stop();
        // v.display();

        // //for bike class
        // v=new Bike("kawasaki",280);
        // v.start();
        // v.stop();
        // v.display();

        // //for truck class
        // v=new Truck("BharatBenz",220);
        // v.start();
        // v.stop();
        // v.display();



        
    }
}