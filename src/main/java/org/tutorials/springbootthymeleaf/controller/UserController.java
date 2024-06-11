package org.tutorials.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.tutorials.springbootthymeleaf.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // handle method to handle variable-expression request
    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Naro", "naro@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        // return with know file in templates folder
        return "variable-expression";
    }

    // handle method to handle selection expression request
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Naro", "naro@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        // return with know file in templates folder
        return "selection-expression";
    }

    // handle method to handle message expressions request
    @GetMapping("/message-expression")
    public String messageExpression() {
        // return with know file in templates folder
        return "message-expression";
    }

    // handle method to handle link expressions request
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        // return with know file in templates folder
        return "link-expression";
    }

    // handle method to handle fragment expressions request
    @GetMapping("/fragment-expression")
    public String fragmentExpression() {
        // return with know file in templates folder
        return "fragment-expression";
    }

    // handle method to handle loop request
    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Naro", "naro@gmail.com", "ADMIN", "Male");
        User rasesh = new User("Rasesh", "rasesh@gmail.com", "USER", "Male");
        User message = new User("Message", "message@gmail.com", "USER", "Male");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(rasesh);
        users.add(message);
        model.addAttribute("users", users);
        return "loop-users";
    }

    // handle method to handle if, unless request
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Naro", "naro@gmail.com", "ADMIN", "Male");
        User rasesh = new User("Rasesh", "rasesh@gmail.com", "USER", "Male");
        User message = new User("Message", "message@gmail.com", "USER", "Male");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(rasesh);
        users.add(message);
        model.addAttribute("users", users);
        return "if-unless";
    }

    // handle method to handle switch case request
    @GetMapping("/switch-case")
    public String switchCaseExpression(Model model) {
        User user = new User("Naro", "naro@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "switch-case";
    }
}
