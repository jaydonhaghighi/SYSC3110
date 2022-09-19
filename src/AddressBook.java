public class AddressBook {
    public void addBuddy(BuddyInfo buddyInfo) {
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jaydon", "Carleton", "613-999-9999");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);


    }
}
