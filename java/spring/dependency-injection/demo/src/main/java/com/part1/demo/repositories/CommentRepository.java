package com.part1.demo.repositories;

import com.part1.demo.models.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
