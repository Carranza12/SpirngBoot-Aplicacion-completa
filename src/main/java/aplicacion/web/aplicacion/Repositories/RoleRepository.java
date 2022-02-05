package aplicacion.web.aplicacion.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aplicacion.web.aplicacion.Entity.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    
}
