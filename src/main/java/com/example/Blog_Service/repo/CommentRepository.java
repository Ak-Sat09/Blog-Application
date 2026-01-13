package com.example.Blog_Service.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog_Service.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findByBlogIdOrderByCreatedAtDesc(
            Long blogId,
            Pageable pageable);
}