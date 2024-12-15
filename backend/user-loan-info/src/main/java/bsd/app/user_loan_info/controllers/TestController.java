package bsd.app.user_loan_info.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello from User Loan Info service!";
    }
}
