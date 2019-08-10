package com.comit.webservice.webservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {
    private AtomicLong idGenerator = new AtomicLong();
    private String template = "Hello %s!";
    private List<Greeting> greetings = new ArrayList<>();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return createGreeting(name);
    }

    @PostMapping("/greeting")
    public Greeting create(@RequestBody String name) {
        Greeting created = createGreeting(name);
        greetings.add(created);
        return created;
    }

    @GetMapping("/greetings")
    public List<Greeting> getAll() {
        return greetings;
    }

    @GetMapping("/greeting/{id}")
    public Greeting findById(@PathVariable Long id) {
        return greetings.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    }

    private Greeting createGreeting(@RequestParam(name = "name") String name) {
        return new Greeting(idGenerator.getAndIncrement(), String.format(template, name));
    }
}
