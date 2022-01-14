package differentMethods;

public class ToStringMethod {
    public static void main(String[] args) {

        Car car = new Car();
        // System.out.println(car);                        //address of car object in memory
        System.out.println(car.toString());
    }
}
//toString() = special method that all objects inherit,
//           = that returns a String that "textually represents" an object.
//           = can be used both implicitly and explicitly