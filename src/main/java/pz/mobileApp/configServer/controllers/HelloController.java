package pz.mobileApp.configServer.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {


    @RequestMapping("/me")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
