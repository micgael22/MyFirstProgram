package boundedTypes;

public class MyGenericClass1<Thing extends Number, Thing2 extends Number> {
    Thing x;
    Thing2 y;

    MyGenericClass1(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }
    public Thing2 getValue() {
        return y;
    }
}
