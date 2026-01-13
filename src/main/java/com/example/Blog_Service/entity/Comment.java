package com.example.Blog_Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments", indexes = {
        @Index(name = "idx_blog_id", columnList = "blogId"),
        @Index(name = "idx_user_id", columnList = "userId")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long blogId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false, length = 2000)
    private String text;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
