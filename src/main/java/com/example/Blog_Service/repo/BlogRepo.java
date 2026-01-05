package com.example.Blog_Service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog_Service.entity.Blog;

public interface BlogRepo extends JpaRepository<Blog, Long> {

}
