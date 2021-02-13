package io.hari.profiletest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author HariomYadav
 * @since 13/02/21
 */
@Configuration
public class MyClass {
    @Profile ("dev")
    @Bean (name = "customer")
    public Customer getDevCustomer() {
        return new Customer(1, "John", "John@gmail.com");
    }

    @Profile ("prod")
    @Bean (name = "customer")
    public Customer getProdCustomer() {
        return new Customer(1, "Martin", "martin@gmail.com");
    }

}
