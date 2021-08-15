package com.homework.domain.core.animal;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Tag("it")
@ActiveProfiles("it")

@Documented
@Target(TYPE)
@Retention(RUNTIME)

@Transactional
@SpringBootTest
@AutoConfigureMockMvc
public @interface IntegrationTest {
}
