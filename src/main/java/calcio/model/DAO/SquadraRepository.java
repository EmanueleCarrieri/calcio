package calcio.model.DAO;

import calcio.model.entity.Squadra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


/**
 * Created by nexse on 12/05/2017.
 */
@Repository
public interface SquadraRepository extends CrudRepository<Squadra, Long> {
    Collection<Squadra> findSquadraById(Integer id);
}
