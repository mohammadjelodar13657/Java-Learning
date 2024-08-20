package chapter1.exercises;

public class PE12 {
    public static void main(String[] args) {
        System.out.println("A runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.");
        System.out.print("His average speed is ");
        System.out.print((24 * 1.6) / ((3600 + 40 * 60 + 35) / 3600.0));
        System.out.println(" kilometers/hours");
    }
}
