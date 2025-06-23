package com.part1.demo.proxies;

import com.part1.demo.models.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
