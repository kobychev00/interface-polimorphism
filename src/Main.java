public class Main {
    public static void main(String[] args) {

        Car car = new Car("car 1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationImpl station = new ServiceStationImpl();
        station.check(car);
        printSeparator();
        station.check(car2);
        printSeparator();
        station.check(bicycle);
        printSeparator();
        station.check(bicycle2);
        printSeparator();
        station.check(truck);
        printSeparator();
        station.check(truck2);

    }
    public static void printSeparator() {
        System.out.println("--------------------------------------");
        System.out.println("Следующий объект обслуживания");
    }
}