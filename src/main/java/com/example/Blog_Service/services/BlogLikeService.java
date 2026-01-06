package com.example.Blog_Service.services;

public interface BlogLikeService {
    boolean toggleLike(Long blogId, Long userId);
}
