// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {

        // Create 2 routes
        Route route1 = new Route("East,Riyadh", "North,Riyadh", 250);
        Route route2 = new Route("North,Jeddah", "middle,Jeedh", 300);

        // Create 2 cars and assign each of them to a different route
        Car car1 = new Car("MMM222", route1, 1);
        Car car2 = new Car("RRR888", route2, 0);



        Passenger[] passengers = new Passenger[2];
        passengers[0] = new SubscribersPassenger("Mariam" ,"22" ,  car1);
        passengers[1] = new NonSubscribersPassenger("Reem", "44", car2,true);


        try {
            passengers[0].reserveCar();
            passengers[1].reserveCar(); // here will throw an Exception
        }catch (Exception e1){
            System.out.println("the capacity is zero");
        }




        passengers[0].displayInfo();
        passengers[1].displayInfo();

    }
}