package jonash.group;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyCustomController {

    @GetMapping("/")
    public String myCustomHandler() {
        return "Some String";
    }
}

