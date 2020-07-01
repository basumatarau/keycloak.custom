package com.github.thomasdarimont.keycloak.embedded.runner.starter;

import com.github.thomasdarimont.keycloak.embedded.runner.EmbeddedKeycloakConfig;
import com.github.thomasdarimont.keycloak.embedded.runner.KeycloakCustomProperties;
import com.github.thomasdarimont.keycloak.embedded.runner.KeycloakProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({KeycloakProperties.class, KeycloakCustomProperties.class})
@ComponentScan(basePackageClasses = EmbeddedKeycloakConfig.class)
public class EmbeddedSpringKeycloakAutoConfiguration {
}
