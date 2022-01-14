package inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
       //car.go();
        System.out.println(car.doors);

        Bicycle bicycle = new Bicycle();
        //bicycle.stop();
        System.out.println(bicycle.pedals);

        //System.out.println(car.speed);
        //System.out.println(bicycle.speed);
    }
}
// inheritance = this is where one class inherit the attributes and methods of another.