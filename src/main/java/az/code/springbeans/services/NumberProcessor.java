package az.code.springbeans.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NumberProcessor implements RandUser{

    RandomNumberService service;

    public NumberProcessor(@Qualifier("class.random.name") RandomNumberService service) {
        this.service = service;
    }

    @Override
    public boolean isOdd() {
        int rand = service.rand();
        System.out.println(rand);
        return rand % 2 == 1;
    }
}
