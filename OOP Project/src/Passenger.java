public class Passenger {
    private String name;
    private int Id;
    private String gender;

    public Passenger(String name, int id,String gender) {
        this.name = name;
        this.Id = id;
        this.gender=gender;

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
        return String.format("Name: %s, Id: %d, Gender: %s",name,Id,gender);
    }
}
