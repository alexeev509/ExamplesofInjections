package beans.configAndComponentProblem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://qaru.site/questions/532450/difference-between-component-and-configuration-in-spring-3
@Configuration //or @Component
public class Config {
    @Bean
    public A a() {
        System.out.println("I am creating new bean A in config");
        return new A();
    }

    //**please see a() method called inside b() method**
    @Bean
    public B b() {
        return new B(a());
    }
}
