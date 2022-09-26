import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> addressBookList = new ArrayList<BuddyInfo>();
    public static void main(String[] args) {
        BuddyInfo buddy0 = new BuddyInfo("Jaydon", "Carleton", "613-999-9999");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy0);
        addressBook.removeBuddy(buddy0);
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        addressBookList.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        addressBookList.remove(buddyInfo);
    }

}
