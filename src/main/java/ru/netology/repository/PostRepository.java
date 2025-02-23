package ru.netology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}