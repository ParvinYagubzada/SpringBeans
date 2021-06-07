package az.code.springbeans.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Order(2)
public class RandomNumberServiceSecond implements RandomNumberService {
    Logger logger = LoggerFactory.getLogger(RandomNumberServiceSecond.class);

    @Override
    public int rand() {
        return new Random().nextInt(100);
    }
}
