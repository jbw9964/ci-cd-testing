package core.app1;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class TestServiceTest {

    @Autowired
    TestService testService;

    @Test
    void getHelloWorld() {
        assertThat(testService.getHelloWorld())
                .isEqualTo(TestService.HELLO_WORLD);
    }

    @Test
    void getRandInt() {
        assertThat(testService.getRandInt())
                .isNotEqualTo(TestService.RAND.nextInt());
    }

    @Test
    void testEquality() {
        assertThat(testService.equality("Fail on purpose"))
                .isEqualTo(true);
    }
}