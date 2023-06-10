class Main { 
    public static void main (String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("AMQ123", new Account ("Andres Herrera", "AND123") );
        // In the line above I am saving this code line car.license = ;
        // In the line above I am saving this code line car.driver = ;
        car.passenger = 4;
        car.pritnDataCar() //Same than system.out.println("Car License: " car.license), but reutilizing existing code, check also car.Java file for better understandign
    }
}