package passObjectsAsArguments;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        Car car3 = new Car("Nissan");

        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
    }
}
