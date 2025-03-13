import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.*;

public class _14_EnabledJRETest {
    @Test
    @EnabledOnJre(JAVA_17)
    void onlyOnJava17() {
        // ...
    }

    @Test
    @EnabledOnJre({ JAVA_17, JAVA_21 })
    void onJava17And21() {
        // ...
    }

    @Test
    @EnabledForJreRange(min = JAVA_9, max = JAVA_11)
    void fromJava9To11() {
        // ...
    }

    @Test
    @EnabledForJreRange(min = JAVA_9)
    void onJava9AndHigher() {
        // ...
    }

    @Test
    @EnabledForJreRange(max = JAVA_11)
    void fromJava8To11() {
        // ...
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
        // ...
    }

    @Test
    @DisabledForJreRange(min = JAVA_9, max = JAVA_11)
    void notFromJava9To11() {
        // ...
    }

    @Test
    @DisabledForJreRange(min = JAVA_9)
    void notOnJava9AndHigher() {
        // ...
    }

    @Test
    @DisabledForJreRange(max = JAVA_11)
    void notFromJava8To11() {
        // ...
    }

    @Test
    @EnabledOnJre(versions = 26)
    void onlyOnJava26() {
        // ...
    }

    @Test
    @EnabledOnJre(versions = { 25, 26 })
// Can also be expressed as follows.
// @EnabledOnJre(value = JAVA_25, versions = 26)
    void onJava25And26() {
        // ...
    }

    @Test
    @EnabledForJreRange(minVersion = 26)
    void onJava26AndHigher() {
        // ...
    }

    @Test
    @EnabledForJreRange(minVersion = 25, maxVersion = 27)
// Can also be expressed as follows.
// @EnabledForJreRange(min = JAVA_25, maxVersion = 27)
    void fromJava25To27() {
        // ...
    }

    @Test
    @DisabledOnJre(versions = 26)
    void notOnJava26() {
        // ...
    }

    @Test
    @DisabledOnJre(versions = { 25, 26 })
// Can also be expressed as follows.
// @DisabledOnJre(value = JAVA_25, versions = 26)
    void notOnJava25And26() {
        // ...
    }

    @Test
    @DisabledForJreRange(minVersion = 26)
    void notOnJava26AndHigher() {
        // ...
    }

    @Test
    @DisabledForJreRange(minVersion = 25, maxVersion = 27)
// Can also be expressed as follows.
// @DisabledForJreRange(min = JAVA_25, maxVersion = 27)
    void notFromJava25To27() {
        // ...
    }
}
