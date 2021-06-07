# Spring Beans - Homework

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

##### You can find code example in test/test folder about @Order.

The @Order annotation defines the sorting order of an annotated component or bean.
> Before Spring 4.0, the **@Order** annotation was used only for the AspectJ execution 
> order. It means the highest order advice will run first.
> Since Spring 4.0, it supports the ordering of injected components to a collection. 
> As a result, Spring will inject the auto-wired beans of the same type based on 
> their order value. [source](https://www.baeldung.com/spring-order)