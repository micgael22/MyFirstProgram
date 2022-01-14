package _polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x : racers){
            x.go();
        }
    }
}
/* Polymorphism = greek word for poly-"many" , morph-"form"
                = The ability of an object to identify more than one type
*/