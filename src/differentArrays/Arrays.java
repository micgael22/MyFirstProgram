package differentArrays;
public class Arrays {

    public static void main(String[] args) {
        /*String [] cars = {"Camaro","Corvette", "Tesla","BMW"};
        cars [0] = "Mustang";
        System.out.println(cars[1]);*/

        String [] cars = new String[4];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        cars[3] = "BMW";

        for (int i = 0; i <cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
// array = used to store multiple values in a single variable