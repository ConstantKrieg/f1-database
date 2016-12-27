
package f1db.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
public class Track extends AbstractPersistable<Long>{
    
    
    private String name;
    
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
