package at.refugeescode.theamazinghelloworld.starter;

import at.refugeescode.theamazinghelloworld.hello.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    public ApplicationRunner startMyHelloWorld(HelloWorld helloWorld) {
        return args -> {
            String text = helloWorld.sayHelloWorld();
            System.out.println(text);
        };
    }


}
