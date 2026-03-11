class Car{

    private int carID,rentPerDay;
    private String carModel;
    private boolean isAvailable;

    Car(int carID,String carModel,int rentPerDay,boolean isAvailable){
        
        setCarID(carID);
        setCarModel(carModel);
        setRentPerDay(rentPerDay);
        this.isAvailable=isAvailable;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void rentCar(){

        if(isAvailable){
            isAvailable=false;
            System.out.println("car rented successfully");
        }
        else
            System.out.println("Car already rented");
    }
  
    public void  returnCar(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("Car returned successfully");
        }
        else{
            System.out.println("Car already rented");
        }
    }

    public void displayCar(){
        System.out.println("Car Id : "+getCarID());
        System.out.println("Car Model : "+getCarModel());
        System.out.println("Car rent perday : "+getRentPerDay());
        
    }

    

}
public class CarRentalSystem {
    public static void main(String[] args) {
        
        Car c1=new Car(1001,"Fortuner",1500,true);

        c1.displayCar();
        c1.rentCar();
        c1.returnCar();
    }
}
