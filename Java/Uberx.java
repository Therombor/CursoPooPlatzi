package Java;

public class Uberx extends Car {
    
    String brand;
    String model;

    public Uberx(String license,Account driver,String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Marca = " + this.brand + "\nModelo = " + this.model);
    }
}
