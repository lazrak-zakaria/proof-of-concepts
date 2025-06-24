package com.part1.demo.services;

import com.part1.demo.models.Comment;
import com.part1.demo.proxies.CommentNotificationProxy;
import com.part1.demo.repositories.CommentRepository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    public final CommentRepository commentRepository;


    public final CommentNotificationProxy commentNotificationProxy;

    private Logger logger =
            Logger.getLogger(CommentService.class.getName());


//    We would have to use @Autowired if the class had more than one constructor.
    public CommentService(CommentRepository commentRepository ,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;

    }

    public void publishComment(Comment comment) {
        logger.info("mid");
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
