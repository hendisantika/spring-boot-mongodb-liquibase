package id.my.hendisantika.springbootmongodbliquibase.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-liquibase
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/01/25
 * Time: 06.23
 * To change this template use File | Settings | File Templates.
 */
@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> saveAll(String... names) {
        return Arrays.asList(names).stream()
                .map(Customer::new)
                .map(customerRepository::save)
                .toList();
    }
}
