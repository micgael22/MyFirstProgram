package staticModifier;
public class Friend {

    String name;
    static int numberOfFriends;

    Friend (String name){
        this.name = name;
        numberOfFriends++;
    }
    // a Static method that returns the amount of friends you have
    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
