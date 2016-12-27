/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f1db.repositories;

import f1db.domain.Race;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kim
 */
public interface RaceRepo extends JpaRepository<Race, Long> {
    
}
