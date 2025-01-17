package id.my.hendisantika.springbootmongodbliquibase;

import id.my.hendisantika.springbootmongodbliquibase.customer.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mongodb:8.0.4:///customerDB"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootMongodbLiquibaseApplicationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void deleteAll() {
        customerRepository.deleteAll();
    }

}
