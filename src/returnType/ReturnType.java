package returnType;
public class ReturnType {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        //int z = add(x,y);
        System.out.println(add(x,y));
    }
    static int add(int x, int y) {
        //int z = x + y;
        return x + y;
    }
}
