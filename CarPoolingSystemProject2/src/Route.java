public class Route {

    private String pickUpaddress;


    private String  destinationAddress;

    private int tripPrice;


    public Route() {
    }

    public Route(String pickUpaddress, String destinationAddress, int tripPrice) {
        this.pickUpaddress = pickUpaddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }


    public String getPickUpaddress() {
        return pickUpaddress;
    }

    public void setPickUpaddress(String pickUpaddress) {
        this.pickUpaddress = pickUpaddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }


    @Override
    public String toString() {
        return "Route{" +
                "pickUpaddress='" + pickUpaddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", tripPrice=" + tripPrice +
                '}';
    }
}
