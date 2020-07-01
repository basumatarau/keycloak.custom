package com.github.thomasdarimont.keycloak;

import com.github.thomasdarimont.keycloak.embedded.runner.runner.Main;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = Main.class)
class EmbeddedSpringBootKeycloakServerXApplicationTests {

    @Test
    void contextLoads() {
    }

}
