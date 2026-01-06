package com.example.Blog_Service.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Blog_Service.entity.BlogLike;
import com.example.Blog_Service.repo.BlogLikeRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogLikeServiceImpl implements BlogLikeService {

    private final BlogLikeRepo repo;

    @Override
    @Transactional
    public boolean toggleLike(Long blogId, Long userId) {

        if (repo.existsByBlogIdAndUserId(blogId, userId)) {
            repo.deleteByBlogIdAndUserId(blogId, userId);
            return false;
        }

        BlogLike like = new BlogLike();

        like.setBlogId(blogId);
        like.setUserId(userId);
        like.setLikedAt(LocalDateTime.now());

        repo.save(like);
        return true;
    }

    public long getLikeCount(Long blogId) {
        return repo.countByBlogId(blogId);
    }

}
