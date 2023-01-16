package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;

@Component
@Qualifier("animals")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
