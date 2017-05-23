package calcio.model.dao;

import calcio.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nexse on 19/05/2017.
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String username);
}
