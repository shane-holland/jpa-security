package dev.shaneholland.demo.jpasecurity.repository;

import dev.shaneholland.demo.jpasecurity.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Long> {
}
