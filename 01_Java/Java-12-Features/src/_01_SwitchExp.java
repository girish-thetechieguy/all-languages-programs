public class _01_SwitchExp {
    public static void main(String[] args) {
        String day = "Monday";
        String typeOfDay = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("It's a " + typeOfDay);
    }
}
