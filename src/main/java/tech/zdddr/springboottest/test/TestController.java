package tech.zdddr.springboottest.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/wocao")
    public String getName(){
        return "nimei";
    }
}
