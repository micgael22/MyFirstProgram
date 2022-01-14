package differentMethods;
public class PrintFMethod {

    public static void main(String[] args) {
        //System.out.printf(" This is a format string %d", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Migo";
        int myInt = 50;
        double myDouble = 1000;

        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble);

        System.out.printf("You have this much money %,f", myDouble);
    }
}
//Flags = adds an effect to output based on the flag added to format specifier
//      = - : left-justify
//      = + : output a plus (+) or minus (-) sign for numeric value
//      = 0 : numeric numbers are zero padded
//      = , : comma grouping separator if number > 1000




//precision = sets number of digits to precision when outputting floating point / double

//width = set the minimum number of characters to be written as output

//PrintF() = an optional method to control, format, and display text to the console window
//         = two arguments = format string + (object/variable/value)
//% [flags] [precision] [width] [conversation-character]

