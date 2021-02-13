package io.hari.profiletest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith (SpringRunner.class)
@ActiveProfiles(value = "dev")
@ContextConfiguration(classes = {MyClass.class}, loader = AnnotationConfigContextLoader.class)
@SpringBootTest
class ProfileTestApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testDevDataSource() {
        Customer customer = (Customer)applicationContext.getBean("customer");
        System.out.println("customer = " + customer);
        assertNotNull(customer);
        assertEquals("John", customer.getName());
    }

}
