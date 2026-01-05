package com.example.Blog_Service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Blog_Service.dto.CreateBlogRequest;
import com.example.Blog_Service.entity.Blog;
import com.example.Blog_Service.mapper.BlogMapper;
import com.example.Blog_Service.repo.BlogRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {

    private final BlogRepo repo;
    private final BlogMapper mapper;

    @Override
    public Blog create(CreateBlogRequest request, Long userId) {

        Blog blog = mapper.toEntity(request, userId);
        repo.save(blog);
        return blog;

    }

    @Override
    public Blog getById(Long blogId) {
        return repo.findById(blogId)
                .orElseThrow(() -> new RuntimeException("Blog not found"));
    }

    @Override
    public List<Blog> getAll() {
        return repo.findAll();
    }

}
