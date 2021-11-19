package org.mybatis.jpetstore.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class BoardElement implements Serializable {
    private String boardId;
    private String writer;
    private String title;
    private String text;
    private Timestamp date;

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getBoardId() {
        return boardId;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Timestamp getDate() {
        return date;
    }
}

