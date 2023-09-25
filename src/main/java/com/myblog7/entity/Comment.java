package com.myblog7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String body;

    // Many-to-one mapping with Post entity
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    // Constructors, getters, and setters (omitted for brevity)

    // Constructors
    // Getters and setters (omitted for brevity)

    // You can add other methods or custom logic as needed.
}

