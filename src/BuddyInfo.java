public class BuddyInfo {

    private String name;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Jaydon");
        System.out.println("Hello " + buddyInfo.getName() + "!");
    }
}
