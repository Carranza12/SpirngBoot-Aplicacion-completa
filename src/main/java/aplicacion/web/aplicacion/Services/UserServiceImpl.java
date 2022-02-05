package aplicacion.web.aplicacion.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.web.aplicacion.Entity.User;
import aplicacion.web.aplicacion.Repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepo;

    @Override
    public Iterable<User> getAllUsers() {
        return UserRepo.findAll();
    }
    
}
