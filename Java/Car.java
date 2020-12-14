package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        this.printDataCar();
    }

     
    void printDataCar(){
        System.out.println("\nLicencia = " + this.license + "\nConductor = " + this.driver.name);
    }
}
