package beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class LazyBone {
    int b;

    @PostConstruct
    void startMethod() {
        System.out.println("START");
    }
}
