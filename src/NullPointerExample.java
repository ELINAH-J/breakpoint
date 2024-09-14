public class NullPointerExample {
    public static void main(String[] args) {
        // Create a String variable but do not initialize it
        String text = null;

        // Try to access a method on the null String, which will cause NullPointerException
        System.out.println(text.length());
    }
}
