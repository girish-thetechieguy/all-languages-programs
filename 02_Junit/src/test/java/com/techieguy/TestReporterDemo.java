package com.techieguy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

public class TestReporterDemo {
    @Test
    void reportSingleValue(TestReporter testReporter) {
        testReporter.publishEntry("a status message");
    }

    @Test
    void reportKeyValuePair(TestReporter testReporter) {
        testReporter.publishEntry("a key", "a value");
    }

    @Test //@DisabledOnJre(JRE.JAVA_8)
    void reportMultipleKeyValuePairs(TestReporter testReporter) {
        Map<String,String> entries = new HashMap<>();
        entries.put("user name", "dk38");
        entries.put("award year", "1974");
        testReporter.publishEntry(
//                Map.of(
//                        "user name", "dk38",
//                        "award year", "1974"
//                ));
                entries);
    }
}
