package dev.shaneholland.demo.jpasecurity.controller;

import dev.shaneholland.demo.jpasecurity.model.Post;
import dev.shaneholland.demo.jpasecurity.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(final PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> finaAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") final Post post) {
        return post;
    }
}
