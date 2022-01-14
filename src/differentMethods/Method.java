package differentMethods;
public class Method {

    public static void main(String[] args) {
        String name = "Migo";
        int age = 21;

        hello(name, age);
    }
    static void hello(String name, int age){
        System.out.println("hello " + name);
        System.out.println("You are " + age);
    }
}
//method is a block of code that is executed whenever it is called upon