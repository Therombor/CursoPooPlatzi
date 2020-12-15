package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        this.passenger = 4;
    }

     
    public void printDataCar(){
        System.out.println("\nLicencia = " + this.license + "\nConductor = " + this.driver.name + "\nPasajeros = " + this.passenger);
    }

    public Integer getPassenger(){
        return this.passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger >= 4){

            this.passenger = passenger;
        }else{
            System.out.println("\n\nHay que asignar un minimo de 4 pasageros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
