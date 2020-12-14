package Java;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Account conductor = new Account("Andres Herrera","23215315");

        Car car = new Car("AMQ123", conductor);
        car.passenger = 4;

        Car car2 = new Car("DFASDFA65", new Account("Patricio","ASD123"));
        car2.passenger = 5;
        

    }
    
}