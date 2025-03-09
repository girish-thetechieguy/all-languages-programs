public class _05_HelpNPE {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // This will throw NPE
        } catch (NullPointerException e) {
            System.out.println("Helpful NPE: " + e.getMessage());
        }
    }
}
