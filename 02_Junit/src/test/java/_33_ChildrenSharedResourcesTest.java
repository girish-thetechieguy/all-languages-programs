import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ResourceLock;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ;
import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;
import static org.junit.jupiter.api.parallel.ResourceLockTarget.CHILDREN;

@Execution(CONCURRENT)
@ResourceLock(value = "a", mode = READ, target = CHILDREN)
public class _33_ChildrenSharedResourcesTest {
    @ResourceLock(value = "a", mode = READ_WRITE)
    @Test
    void test1() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @Test
    void test2() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @Test
    void test3() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @Test
    void test4() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @Test
    void test5() throws InterruptedException {
        Thread.sleep(2000L);
    }
}
