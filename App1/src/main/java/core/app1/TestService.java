package core.app1;

import java.util.*;
import org.springframework.stereotype.*;

@Service
public class TestService {

    public static String HELLO_WORLD = "Hello World";
    public static int RAND_INT = new Random().nextInt();

    public String getHelloWorld() {
        return HELLO_WORLD;
    }

    public int getRandInt() {
        return RAND_INT;
    }

    public boolean equality(String given) {
        return HELLO_WORLD.equals(given);
    }

    public void unusedMethod() {
        System.out.println("Check test coverage");
    }
}
