package Diary;

import java.time.LocalDateTime;

public class Entry {
    private  int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    public Entry(String title, String body){
        this.title = title;
        this.body = body;
        this.id++;
    }
    public Entry(int id, String title, String body){
        this.title = title;
        this.body = body;
        this.id = id;
    }
    public int  getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getBody(){ return body; }
}
