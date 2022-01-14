package differentLoops;
import java.util.ArrayList;
public class ForEachLoop {

    public static void main(String[] args) {
        //String[] animals = {"cat","dog","rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("cat");

        for (String i : animals){
            System.out.println(i);
        }
    }
}
//for-each loop= traversing technique to iterate through the elements in an array/collection
//less steps, more readable
//less flexible
