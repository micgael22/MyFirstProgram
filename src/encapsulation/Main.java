package encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet","Camaro",2025);

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
/*  Encapsulation = attributes of a class will be hidden or private,
                  = can be accessed only through methods (getters and setters)
                  = you should make attributes privat if you don't have a reason to make them public/protected
*/