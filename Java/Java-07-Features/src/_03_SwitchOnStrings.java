public class _03_SwitchOnStrings {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the week!");
                break;
            case "Friday":
                System.out.println("End of the week!");
                break;
            default:
                System.out.println("Midweek day.");
        }
    }
}
