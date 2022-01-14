package superKeyword;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 45, "strength");

        System.out.println(hero2.toString());
    }
}
/* super = keyword refers to the superclass (parent) of an object
         = it is very similar to the "this" keyword

is really referring to the superclass where = "this" refers this class
 */