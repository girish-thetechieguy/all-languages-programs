public class _04_UserPojo {
    private String username;
    private String password;

    public _04_UserPojo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Method to validate password strength
    public boolean isPasswordStrong() {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}
