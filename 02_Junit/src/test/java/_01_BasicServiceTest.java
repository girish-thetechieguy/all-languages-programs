import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class _01_BasicServiceTest {
    @Test
    void getGradeTest(){
        _01_BasicService basicService = new _01_BasicService();
        String grade = basicService.getGrade(20);
        Assertions.assertEquals("Failed", grade);
    }

}