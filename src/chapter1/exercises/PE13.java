package chapter1.exercises;

public class PE13 {
    public static void main(String[] args) {
        System.out.println("The solution of equations of ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + 0.55y = 5.9");
        System.out.println("is:");
        System.out.print("x = ");
        System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.print("y = ");
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));

    }
}
