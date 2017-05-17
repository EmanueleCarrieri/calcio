package calcio.model.DAO;

import calcio.model.entity.Calciatore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by nexse on 12/05/2017.
 */
@Repository
public interface CalciatoreRepository extends CrudRepository<Calciatore,Long> {

}
