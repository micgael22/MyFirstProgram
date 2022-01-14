package differentArrays;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("hamburgers");
        food.add("hot dog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i <food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
// DifferentArrays.Arraylist = a resizeable array
//           = Elements can be added and removed after compilation phase
//           = store reference data types