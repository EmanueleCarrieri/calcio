package calcio.model;

import org.springframework.data.repository.CrudRepository;


/**
 * Created by nexse on 12/05/2017.
 */

public interface CalciatoreRepository extends CrudRepository<Calciatore,Long> {
    //Collection<Calciatore> findByCalciatoreNome(String nome);
}
