public class NonSubscribersPassenger extends Passenger{

    private boolean hasDiscountCoupon;

    public NonSubscribersPassenger(String name, String id, Car reservedCar, boolean hasDiscountCoupon) {
        super(name, id, reservedCar);
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    @Override
    public void reserveCar() throws Exception {
        if (getReservedCar().getCapacity() == 0) {
            throw new Exception("The capacity of the car is 0");
        }
        double tripCost;
        if (hasDiscountCoupon) {
             tripCost = getReservedCar().getRoute().getTripPrice() - getReservedCar().getRoute().getTripPrice()*0.1;
        }else {
            tripCost = getReservedCar().getRoute().getTripPrice();
        }

        setTripCost(tripCost);
        System.out.println("tripCost " + getTripCost());

    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("car code: " + getReservedCar().getCode());
        System.out.println("Trip cost: " + getTripCost());
        System.out.println("has a discount: " + hasDiscountCoupon);

    }
}
