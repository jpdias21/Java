package application;

import entities.Comment;
import entities.Post;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date firstDate = new Date();
        Post post01 = new Post(firstDate,"Good night guys", "See you tomorrow", 12);

        post01.addComment(new Comment("Adicionando comentario post01"));
        post01.addComment(new Comment("Adicionando comentario post01"));


        Post post02 = new Post(firstDate, "Good morning","Good morning",40);
        post02.addComment(new Comment("Adicionando comentario post02"));
        post02.addComment(new Comment("Adicionando comentario post02"));

        System.out.println(post01);
        System.out.println("----------");
        System.out.println(post02);
    }
}