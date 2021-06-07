# Spring Beans

### @Aspect

Tried a bunch of methods for adding @Aspect class as Spring bean. Just found 3
methods:
1. Adding **@Component** annotation on aspect class.
2. Adding aspect class to spring.xml configuration as bean.
3. Adding aspect class to **@Configuration** class with **@Bean** annotation.

> You may register aspect classes as regular beans in your Spring XML 
> configuration, or autodetect them through classpath scanning - just 
> like any other Spring-managed bean. However, note that the **@Aspect** 
> annotation is not sufficient for autodetection in the classpath: 
> For that purpose, you need to add a separate **@Component** annotation 
> (or alternatively a custom stereotype annotation that qualifies, 
> as per the rules of Spring’s component scanner). 
> [source](https://docs.spring.io/spring-framework/docs/4.3.15.RELEASE/spring-framework-reference/html/aop.html)
### @Order


> 