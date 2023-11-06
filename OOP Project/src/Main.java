public class Main {
    public static void main(String[] args) {

        Taxi t1=new Taxi(123,2,4);
        Taxi t3=new Taxi(125,6,7);
        Taxi t2=new Taxi(124,3,4);
        Taxi t4=new Taxi(126,15,26);
        Passengers p1=new Passengers("A",11,22);
        Manager m1=new Manager();

        m1.addTaxi(t2);
        m1.addTaxi(t3);
        m1.addTaxi(t1);

        m1.addTaxi(t4);
        m1.addPassenger(p1);
        System.out.println(m1.NearestTaxi(p1));


    }
}