package boundedTypes;

public class Main {

        public static void main(String[] args) {
            MyGenericClass1<Integer, Integer> myInt = new MyGenericClass1<>(1, 9);
            MyGenericClass1<Double, Double> myDouble = new MyGenericClass1<>(3.14, 1.01);

           //MyGenericClass1<Character, String> myChar = new MyGenericClass1<>('@',"bye");
            //MyGenericClass1<String, Character> myString = new MyGenericClass1<>("Hello",'G');

            //ArrayList<String> myFriends = new ArrayList<>(); //this array list a generic class so, we can store what ever reference data types we want within in t we just have to declare<>
            //HashMap<Integer, String> users = new HashMap<>(); //HashMap is a collection of key value pares and accept reference data types

            System.out.println(myInt.getValue());
            System.out.println(myDouble.getValue());
            //System.out.println(myChar.getValue());
            //System.out.println(myString.getValue());
        }
    }
//bounded types = you can create the objects of a generic class to have data
//              = of a specific derived types ex.Number

