/**
 * Test
 * 
 * Method Overloading
 */
class Feature {

    static void addition(int a, int b) {
        System.out.println("Answer: " + (a + b));
    }

    // method over-loading
    static void addition(double a, double b) {
        System.out.println("Answer: " + (a + b));
    }

    static void addition(int a, int b, int c) {
        System.out.println("Answer: " + (a + b + c));
    }

}

public class Test {

    public static void main(String[] args) {
        Feature.addition(4, 5);
        Feature.addition(5.4, 6.4);
        Feature.addition(3, 5, 6);

    }
}