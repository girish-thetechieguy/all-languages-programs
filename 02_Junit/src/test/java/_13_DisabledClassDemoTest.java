import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Disabled until bug #99 has been fixed")
public class _13_DisabledClassDemoTest {
    @Test
    void testWillBeSkipped() {
    }

//    @Disabled("Disabled until bug #42 has been resolved")
//    @Test
//    void testWillBeSkipped() {
//    }

    @Test
    void testWillBeExecuted() {
    }

}
