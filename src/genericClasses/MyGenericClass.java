package genericClasses;

public class MyGenericClass <Thing, Thing2>{  //Usually they use the letter V for thing 2.

    Thing x;
    Thing2 y;

    MyGenericClass (Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }
    public Thing2 getValue(){
        return y;
    }
}
