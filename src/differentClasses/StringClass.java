package differentClasses;

public class StringClass {

    public static void main(String[] args) {
        String name = "Micgael";
        //boolean result = name. equalsIgnoreCase("micgael");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("M");
        // boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();

        String result = name.replace('e','o');
        System.out.println(result);
    }
}
// String = a reference type that can store one or more characters
//          reference data types have access to useful methods