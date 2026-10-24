package id.my.hendisantika.springbootmongodbliquibase;

import id.my.hendisantika.springbootmongodbliquibase.customer.Customer;
import id.my.hendisantika.springbootmongodbliquibase.customer.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.mongodb.MongoDBContainer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(webEnvironment = RANDOM_PORT)
class SpringBootMongodbLiquibaseApplicationTests {

    @Container
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:8.0.4");

    @Autowired
    private CustomerRepository customerRepository;

    @DynamicPropertySource
    static void mongoProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.mongodb.uri", () -> mongoDBContainer.getReplicaSetUrl("customers"));
        registry.add("spring.data.mongodb.uri", () -> mongoDBContainer.getReplicaSetUrl("customers"));
    }

    @Test
    void liquibaseChangelogSeedsCustomers() {
        assertThat(customerRepository.findAll())
                .extracting(Customer::getName)
                .hasSize(14)
                .contains("Yuji", "Gojo", "John Doe", "Jane Doe");
    }

}
