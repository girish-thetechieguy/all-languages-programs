package com.techieguy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTests {
    @Test
    @EnabledOnOs(OS.MAC)
    void onlyOnMac() {
        assertTrue(true);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.SOLARIS, OS.WINDOWS})
    void onlyOnLinuxSolarisWindows() {
        // ...
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void onlyOnJava8() {
        assertTrue(true);
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_11, JRE.JAVA_17})
    void okayOnJava8and11and17() {
        assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void okayForJREFrom8to17() {
    }

    @Test
    //@EnabledForJreRange(max = JRE.JAVA_17)
    @EnabledForJreRange(min = JRE.JAVA_9)
    void jre9andAbove() {
    }

    @Test
    @EnabledIfSystemProperty(named = "ciserver", matches = "true")
    void onCiServer() {
        // ...
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void onlyOn64BitArchitectures() {
        // ...
    }

    @Test
    void showSystemProperties() {
        System.getProperties()
                .forEach((prop, value) -> System.out.println(prop + " = " + value));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "staging-server")
    void onlyOnStagingServer() {
        // ...
    }

    @Test
    @EnabledIf("customCondition")  // new in JUnit 5.7
    void enabled() {
        // ...
    }

    @Test
    @DisabledIf("customCondition")
    void disabled() {
        // ...
    }

    // method takes no arguments and returns a boolean
    boolean customCondition() {
        return true;
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    @EnabledIfSystemProperty(named = "user.country", matches = ".*US.*")
    void runs_only_on_64bit_architectures_in_US() {
        System.out.println("This test runs only on 64-bit architectures in the US");
    }

    @Test
    @EnabledIf("hasAtLeastFourProcessors")
    void only_runs_if_four_processors_available() {
        System.out.println("This test runs only if there are at least 4 processors");
    }

    private boolean hasAtLeastFourProcessors() {
        return Runtime.getRuntime().availableProcessors() >= 4;
    }

}
