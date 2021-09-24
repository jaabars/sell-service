package kg.easy.sellservice.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {


    @PostMapping("/signIn")
    public ResponseEntity<?> getCode(@RequestParam String login){
        /*
        * Реализовать получение 4-х значного кода на почту пользователя
        * Hello from Git!!!!!!!!!!!!
        * */
        return null;
    }
}
