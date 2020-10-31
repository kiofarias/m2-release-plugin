package kiofarias.springframework;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @org.junit.jupiter.api.Test
    void getHello() {
        System.out.println(new JavaHelloWorld().getHello());
    }
}