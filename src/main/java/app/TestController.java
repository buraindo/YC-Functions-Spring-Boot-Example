package app;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/get/{name}")
    public String get(final @PathVariable String name) {
        return String.format("Hello, %s", name);
    }
}