import java.util.Date;

class AirlinePassenger{

    private static int counter;
    private final String registrationId;
    private String name;
    private long  contactNumber;
    private String passportNumber;
    static {
        counter = 1001;
    }
    //constructor
    public  AirlinePassenger(String name,long contactNumber , String passportNumber){
        this.name = name;
        this.passportNumber = passportNumber;
        this.contactNumber = contactNumber;
        this.registrationId = "P"+ counter;
        AirlinePassenger.counter++;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        AirlinePassenger.counter = counter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return passportNumber;
    }
    public void setBranch(String pNumber) {
        this.passportNumber = pNumber;
    }

    public long getContactNumber() {
        return this.contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }


}

public class Tester {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        AirlinePassenger passenger1 = new AirlinePassenger("John", 9876543210L, "AB1234567" );
        AirlinePassenger passenger2 = new AirlinePassenger("Alice", 91234567890L, "XY9876543");
        System.out.println("Hi " +passenger1.getName()+"! Your registration id is "+ passenger1.getRegistrationId() );
        System.out.println("Hi " +passenger2.getName()+"! Your registration id is "+ passenger2.getRegistrationId());
    }
}