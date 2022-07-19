package application;

import utilities.Comments;
import utilities.Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");


        Comments comentario1 = new Comments("Have a nice trip");
        Comments comentario2 = new Comments("Wow, that's awesome!");
        Posts post1 = new Posts("Traveling to New Zealand",
                sdf.parse("21/06/2018 13:05:44"),
                "I'm going to visit this wonderful country",
                12);
        post1.addComment(comentario1);
        post1.addComment(comentario2);

        System.out.println(post1);

        Comments comentario3 = new Comments("Good night");
        Comments comentario4 = new Comments("May the force be with you");
        Posts post2 = new Posts("Good night guys",
                sdf.parse("28/07/2018 23:14:19"),
                "See you tomorrow",
                5);
        post1.addComment(comentario3);
        post1.addComment(comentario4);

        System.out.println(post2);



    }
}
