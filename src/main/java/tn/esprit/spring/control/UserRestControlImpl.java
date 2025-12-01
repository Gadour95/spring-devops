package tn.esprit.spring.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestControlImpl {

    // http://localhost:8083/SpringMVC/servlet/
    @GetMapping("/")
    public String welcome() {
        return "Hello from Abdelkader Sniha.";
    }

}
