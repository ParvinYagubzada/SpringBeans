package az.code.springbeans;

import az.code.springbeans.services.RandomNumberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringBeansApplicationTests {

    @Autowired
    private List<RandomNumberService> service;

    @Test
    void orderAnnotation() {
        assertTrue(service.get(0).getClass().getSimpleName().contains("RandomNumberServiceFirst"));
        assertTrue(service.get(1).getClass().getSimpleName().contains("RandomNumberServiceSecond"));
    }
}
