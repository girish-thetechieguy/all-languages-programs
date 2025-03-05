public class _02_NPEgetMessege {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length()); // This will throw NPE
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
