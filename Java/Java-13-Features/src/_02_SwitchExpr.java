public class _02_SwitchExpr {
    public static void main(String[] args) {
        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("It's a " + dayType);
    }
}
