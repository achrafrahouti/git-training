public class Animal {

    public static String greatingHuman() {
        return "Hello human";
    }
    public static String greatingBird() {
        return "Tweet!!";
    }
    public static String greatingCat() {
        return "Meow!!";
    }
    public static void main(String[] args) {
        String arg1 = args[0];
        if (arg1.equalsIgnoreCase("bird")) {
            System.out.println(greatingBird());
        }
        else if (arg1.equalsIgnoreCase("cat")) {
            System.out.println(greatingCat());
        }
        else {
            System.out.println(greatingHuman());
        }
    }
}