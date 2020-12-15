package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license,Account driver,Map<String, Map<String,Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial){

        super(license, driver);
        super.setPassenger(6);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {

        if (passenger >= 6) {
            super.setPassenger(passenger);
        } else {
            System.out.println("\n\nHay que asignar un minimo de 6 pasageros");
        }
    }
}
