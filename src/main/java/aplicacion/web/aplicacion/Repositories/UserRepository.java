package aplicacion.web.aplicacion.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aplicacion.web.aplicacion.Entity.User;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    
}
