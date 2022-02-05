package aplicacion.web.aplicacion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import aplicacion.web.aplicacion.Entity.User;
import aplicacion.web.aplicacion.Repositories.RoleRepository;
import aplicacion.web.aplicacion.Services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userServ;

    @Autowired
    private RoleRepository RoleRepo;

    @GetMapping("/")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(Model model, Model model2){
        model.addAttribute("roles", RoleRepo.findAll());
        model2.addAttribute("User", new User());
        return "register";
    }
    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("userList", userServ.getAllUsers());
        return "users";
    }
}
