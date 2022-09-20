import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> addressBookList = new ArrayList<BuddyInfo>();
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jaydon", "Carleton", "613-999-9999");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        addressBookList.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        addressBookList.remove(buddyInfo);
    }

}
