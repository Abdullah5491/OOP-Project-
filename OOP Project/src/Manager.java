import java.util.ArrayList;

public class Manager {
    ArrayList<Taxi> taxiList = new ArrayList<Taxi>();
    ArrayList<Passengers> passengerList = new ArrayList<Passengers>();
    ArrayList<Integer> distanceList = new ArrayList<Integer>();

    public void addTaxi(Taxi taxi) {
        taxiList.add(taxi);
    }

    public void addPassenger(Passengers passenger) {
        passengerList.add(passenger);
    }

    public Taxi NearestTaxi(Passengers passenger) {

        Taxi nearestTaxi = null;
        for (int i=0;i<taxiList.size(); i++) {
            int d= (taxiList.get(i).x - passenger.x) +(taxiList.get(i).y- passenger.y);
            distanceList.add(d);
            for (int j=0;j<distanceList.size();j++){
                if (distanceList.get(j)<distanceList.get(j+1)){
                    nearestTaxi=taxiList.get(j);
                }
            }


        }
        return nearestTaxi;
    }
}