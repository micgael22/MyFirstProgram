package differentClasses;
public class WrapperClass {

    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Micgael";

        if ( b == '@'){
            System.out.println(true);
        }
    }
}
/* Wrapper class = provides a way to use primitive data types as reference type
      advantages = reference data types contain useful methods
              can be used with collections (ex. DifferentArrays.Arraylist)
2 features called = Autoboxing - the automatic conversation that the java compiler makes between primitive data
                   types and corresponding object wrapper
                  = Unboxing - the reverse of autoboxing.Automatic conversation of Wrapper class to primitive*/
