
package f1db.repositories;

import f1db.domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DriverRepo extends JpaRepository<Driver, Long> {
    public Driver findByName(String name);
    public Driver findByNumber(int number);
}
