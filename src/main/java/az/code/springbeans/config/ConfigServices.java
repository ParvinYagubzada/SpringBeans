package az.code.springbeans.config;

import az.code.springbeans.aspects.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
public class ConfigServices {

    @Bean
    @Scope("singleton")
    public LogAspect aspect() {
        return new LogAspect();
    }
}
