import java.util.ArrayList;

public class BusStaff  {


    private String Staffname;
    private int StaffId;
    private StaffRoles role;
    private Accounts account;
    private double salary;

    public ArrayList<Bus> buseDuties=new ArrayList<>();

    public BusStaff(String staffname, int staffId, StaffRoles role, double salary, String contactNumber, String emailAddress, String password) {
        Staffname = staffname;
        StaffId = staffId;
        this.role = role;
        this.account = new Accounts(emailAddress, contactNumber, password);
        this.salary = salary;
    }
    public BusStaff(String staffname, int staffId, StaffRoles role, double salary,String contactNumber, String password) {
        Staffname = staffname;
        StaffId = staffId;
        this.role = role;
        this.account = new Accounts(contactNumber, password);
        this.salary = salary;
    }

    public String getStaffname() {
        return Staffname;
    }

    public void setStaffname(String staffname) {
        Staffname = staffname;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int staffId) {
        StaffId = staffId;
    }

    public StaffRoles getRole() {
        return role;
    }

    public void setRole(StaffRoles role) {
        this.role = role;
    }

    public Accounts getAccount() {
        return account;
    }

    public ArrayList<Bus> getBuseDuties() {
        return buseDuties;
    }

    public void setBuseDuties(ArrayList<Bus> buseDuties) {
        this.buseDuties = buseDuties;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addBusDuty(Bus bus){
        buseDuties.add(bus);
    }
    public void removeBusDuty(Bus bus){
        buseDuties.remove(bus);
    }
    public String toString(){
        return "Staff Name: "+Staffname+"\nStaff ID: "+StaffId+"\nStaff Role: "+role+"\nStaff Salary: "+salary;
    }

}
