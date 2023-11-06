public class Taxi {
    int id;
    int x, y;

    public Taxi(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
