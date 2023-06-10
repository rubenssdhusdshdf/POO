class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Acccount driver){
        this.license= license;
        this.driver = driver;
    }

    void pritnDataCar(){
        System.out.printLn("License: " + license + "Name Driver: " + driver.name);
    }
}