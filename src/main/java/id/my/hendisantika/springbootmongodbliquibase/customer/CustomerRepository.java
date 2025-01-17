package id.my.hendisantika.springbootmongodbliquibase.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-liquibase
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/01/25
 * Time: 06.22
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
