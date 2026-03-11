interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartLight implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartLight is on");
    }
    @Override
    public void turnOff(){
        System.out.println("SmartLight is off");
    }
}

class SmartFan implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartFan is on");
    }
    @Override
    public void turnOff(){
        System.out.println("SmartFan is off");
    }
}

class SmartTV implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("SmartTV is on");
    }
    @Override
    public void turnOff(){
        System.out.println("SmartTV is off");
    }
}
public class SmartDeviceSystem{
    public static void main(String[] args) {
        SmartDevice []device={new SmartLight(),new SmartFan(),new SmartTV()};

        for(SmartDevice d:device){
            d.turnOff();
            d.turnOn();
        }
    }
}