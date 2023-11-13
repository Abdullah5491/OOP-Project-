public class Passenger {
    private String name;
    private int Id;

    public Passenger(String name, int id) {
        this.name = name;
        Id = id;
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
    public String toString(){
        return String.format("Name: %s, Id: %d",name,Id);
    }
}
