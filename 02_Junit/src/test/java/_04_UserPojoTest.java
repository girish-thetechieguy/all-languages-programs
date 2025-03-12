import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _04_UserPojoTest {
    @Test
    public void testIsPasswordStrong() {
        _04_UserPojo user1 = new _04_UserPojo("user1", "pass1234");
        assertTrue(user1.isPasswordStrong(), "Password 'pass1234' should be strong");

        _04_UserPojo user2 = new _04_UserPojo("user2", "weak");
        assertFalse(user2.isPasswordStrong(), "Password 'weak' should not be strong");
    }

}