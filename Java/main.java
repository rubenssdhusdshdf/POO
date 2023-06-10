class Main { 
    public static void main (String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.pritnDataCar() //Same than system.out.println("Car License: " car.license), but reutilizing existing code, check also car.Java file for better understandign
    }
}