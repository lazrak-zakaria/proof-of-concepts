package com.part1.demo.repositories;

import com.part1.demo.models.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment){
        System.out.println("storing " + comment);
    }
}
