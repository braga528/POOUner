public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account diver) {
        this.license = license;
        this.driver = diver;
        
    }

    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver + " Passenger: " + passenger);
    }
}
