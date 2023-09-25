package com.myblog7.service;

import com.myblog7.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId,CommentDto commentDto);



    List<CommentDto> getCommentsByPostId(Long postId);

    CommentDto getCommentsById(Long postId, Long commentId);

    List<CommentDto> getAllCommentsById();

    void deleteCommentById(Long postId, Long commentId);
}
