package tech.zdddr.springboottest.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/wocao")
    public String getName(){
        return "ssssss";
    }

    @RequestMapping("/getNiu")
    public Map getData(){
        Map<String,Object> result = new HashMap<>();
        result.put("ni","you");
        return result;
    }
}
