package tn.esprit.spring.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestControlImpl {

    // http://localhost:8083/SpringMVC/servlet/
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Hello from Abdelkader Sniha.";
    }

}
