package core.app1;

import java.util.*;
import org.springframework.stereotype.*;

@Service
public class TestService {

    public static final String HELLO_WORLD = "Hello World";
    public static final Random RAND = new Random();

    public String getHelloWorld() {
        return HELLO_WORLD;
    }

    public int getRandInt() {
        return RAND.nextInt();
    }

    public boolean equality(String given) {
        return HELLO_WORLD.equals(given);
    }

    public void unusedMethod() {
        System.out.println("Check test coverage");
    }
}
