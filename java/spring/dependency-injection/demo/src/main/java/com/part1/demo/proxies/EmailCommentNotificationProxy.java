package com.part1.demo.proxies;

import com.part1.demo.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {


    @Override
    public void sendComment(Comment comment){
        System.out.println("send " + comment);
    }

}
