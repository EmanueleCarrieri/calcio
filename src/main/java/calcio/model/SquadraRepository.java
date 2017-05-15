package calcio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by nexse on 12/05/2017.
 */
@Repository
public interface SquadraRepository extends CrudRepository<Squadra, Long> {
    //Squadra findBySquadraName(String name);
}
