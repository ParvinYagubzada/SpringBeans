package az.code.springbeans;

import az.code.springbeans.services.RandUser;
import az.code.springbeans.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeansApplication implements CommandLineRunner {

    ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringBeansApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RandUser service = context.getBean(RandUser.class);
        System.out.println(service.isOdd());
    }

    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}
