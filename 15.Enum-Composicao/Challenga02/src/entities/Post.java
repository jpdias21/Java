package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Post {
    Date date;
    private String title;
    private String content;
    private Integer like;

    private List<Comment> comments = new ArrayList<>();

    public Post(Date date,String title, String content, Integer like) {
        this.date = date;
        this.content = content;
        this.like = like;
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(String comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(like).append(" Likes - ");
        sb.append(date).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for(Comment c : comments) {
            sb.append(c.getText()).append("\n");
            //         ↑ Chama método do objeto
        }
        return sb.toString();
    }
}
