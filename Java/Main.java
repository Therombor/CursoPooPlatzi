package Java;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Account conductor = new Account("Andres Herrera","23215315");

        Car car = new Car("AMQ123", conductor);
        // car.passenger = 4;
        car.setPassenger(4);
        car.printDataCar();
        
        Uberx car2 = new Uberx("DFASDFA65", new Account("Patricio","ASD123"),"Chevrolet","Park");
        car2.setPassenger(4);
        car2.printDataCar();
        // car2.passenger = 5;
        

    }
    
}