package com.example.Blog_Service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog_Service.entity.BlogLike;

public interface BlogLikeRepo extends JpaRepository<BlogLike, Long> {

    boolean existsByBlogIdAndUserId(Long blogId, Long userId);

    void deleteByBlogIdAndUserId(Long blogId, Long userId);

    long countByBlogId(Long blogId);
}
