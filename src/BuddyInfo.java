import java.lang.reflect.Array;

public class BuddyInfo {

    private String name;
    private String location;
    private String phoneNumber;



    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BuddyInfo(String name, String location, String phoneNumber) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Tom", "Ontario", "613-999-9999");
    }
}
