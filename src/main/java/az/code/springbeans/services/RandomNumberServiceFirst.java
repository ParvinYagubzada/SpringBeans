package az.code.springbeans.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Primary
@Order(1)
@Qualifier("class.random.name")
public class RandomNumberServiceFirst implements RandomNumberService {
    Logger logger = LoggerFactory.getLogger(RandomNumberServiceFirst.class);

    @Override
    public int rand() {
        return new Random().nextInt(100);
    }
}
