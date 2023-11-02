package ua.tquintas.jpa;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    private final UsersRepository usersRepository;
    @Autowired
    public UsersController(UsersRepository usersRepository)
    {
        this.usersRepository = usersRepository;
    }
    @GetMapping("/signup")
    public String showSignUpForm(Users users) {
        return "add-users";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid Users users, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-users";
        }

        usersRepository.save(users);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", usersRepository.findAll());
        return "index";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Users users = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("users", users);
        return "update-users";
    }
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Users users,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            users.setId(id);
            return "update-users";
        }

        usersRepository.save(users);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Users users = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        usersRepository.delete(users);
        return "redirect:/index";
    }
}