import java.util.ArrayList;

public class Passenger {
    private String name;
    private int Id;
    private String gender;
    private int contactNumber;
    private String emailAddress;
   public ArrayList<Seat> Bookedseats=new ArrayList<>();

    public Passenger(String name, int id,String gender) {
        this.name = name;
        this.Id = id;
        this.gender=gender;

    }

    public Passenger(String name, int id, String gender, int contactNumber, String emailAddress) {
        this.name = name;
        Id = id;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;

    }
    public Passenger(String name, int id, String gender,  String emailAddress) {
        this.name = name;
        Id = id;
        this.gender = gender;
        this.emailAddress = emailAddress;

    }

    public Passenger(String name, int id, String gender, int contactNumber) {
        this.name = name;
        Id = id;
        this.gender = gender;
        this.contactNumber = contactNumber;

    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString(){
        return String.format("Passenger Name: %s, Passenger Id: %d, Gender: %s",name,Id,gender);
    }

    public void removeBookedSeat(Seat s){
            s.setReserved(false);
            Bookedseats.remove(s);
        }
        public void displayBookedSeats(){
            for(Seat s:Bookedseats){
                System.out.println(s);
            }
        }


}
