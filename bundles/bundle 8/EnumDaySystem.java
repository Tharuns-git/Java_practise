enum Days{
    Monday,Tuesday ,Wednesday ,Thursday ,Friday ,Saturday,Sunday;
}
public class EnumDaySystem {
    public static void main(String[] args) {
        
        for(Days day:Days.values())
            if(day==Days.Saturday||day==Days.Sunday)
                System.out.println(day+" is weekend.");
            else
                System.out.println(day+" is working day");
    }
   
}
