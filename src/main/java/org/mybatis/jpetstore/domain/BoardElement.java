package org.mybatis.jpetstore.domain;

import java.sql.Timestamp;

public class BoardElement {
    private String title;
    private Timestamp date;
    private String writer;
    private String text;
    private String id;

    public void setTitle(String title){
        this.title=title;
    }
    public void setDate(Timestamp date){
        this.date = date;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }
    public Timestamp getDate(){
        return this.date;
    }
    public String getWriter(){
        return this.writer;
    }
    public String getText(){
        return this.text;
    }
    public String getId(){
        return this.id;
    }
}
