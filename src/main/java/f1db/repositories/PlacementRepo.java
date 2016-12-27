
package f1db.repositories;

import f1db.domain.Placement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlacementRepo extends JpaRepository<Placement, Long>{
    
}
