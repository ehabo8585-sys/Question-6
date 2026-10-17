
public class Staff {
    protected String StaffNo;
    protected String StaffName;
    protected int StaffAge;

    public Staff(String StaffNo, String StaffName, int StaffAge) {
        this.StaffNo = StaffNo;
        this.StaffName = StaffName;
        this.StaffAge = StaffAge;
    }

    public void display() {
        System.out.println("Staff Number: " + StaffNo);
        System.out.println("Staff Name: " + StaffName);
        System.out.println("Staff Age: " + StaffAge);
    }
}
