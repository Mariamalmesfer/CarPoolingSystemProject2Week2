public class SubscribersPassenger extends Passenger{

    public SubscribersPassenger(String name, String id, Car reservedCar) {
        super(name, id, reservedCar);
    }

    @Override
    public void reserveCar() throws Exception {
        if (getReservedCar().getCapacity() == 0) {
            throw new Exception("The capacity of the car is 0");
        }
        double tripCost = getReservedCar().getRoute().getTripPrice() - getReservedCar().getRoute().getTripPrice()*0.5;
        setTripCost(tripCost);
        System.out.println("tripCost " + getTripCost());
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("car code: " + getReservedCar().getCode());
        System.out.println("Trip cost: " + getTripCost());

    }


}
