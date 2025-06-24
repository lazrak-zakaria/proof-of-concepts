package com.part1.demo.models;

public class Comment {
    public String author;
    public String text;


    @Override
    public String toString(){
        return "Comment" + author + ": " + text;
    }


}
