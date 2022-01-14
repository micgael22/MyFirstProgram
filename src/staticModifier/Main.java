package staticModifier;
public class Main {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.displayFriends();
    }
}
//Static = modifier. Single copy of a variable/method is created and shared.
//       = the class "owns" the static member