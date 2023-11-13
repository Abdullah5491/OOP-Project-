public class Seat {
    private int SeatID;
    private double SeatPrice;
    private String Category;

    public int getSeatID() {
        return SeatID;
    }

    public void setSeatID(int seatID) {
        SeatID = seatID;
    }

    public double getSeatPrice() {
        return SeatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        SeatPrice = seatPrice;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Seat(int seatID, double seatPrice, String category) {
        SeatID = seatID;
        SeatPrice = seatPrice;
        Category = category;
    }
}
