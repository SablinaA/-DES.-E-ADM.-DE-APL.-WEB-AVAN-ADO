package controller;

import com.uniesp.aula1.Aula1Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Hello_world {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}




