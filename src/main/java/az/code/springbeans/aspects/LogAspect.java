package az.code.springbeans.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(int az.code.springbeans.services.RandomNumberServiceFirst.rand())")
    public void after() {
        logger.warn("after() executed");
    }
}
