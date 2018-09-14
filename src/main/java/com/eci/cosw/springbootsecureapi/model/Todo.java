package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {
    private String text;
    private int priority;
    private Date duedate;

    public Todo() {
        this("", 0, new Date());
    }

    public Todo(String _text, int _priority, Date _duedate) {
        this.text = _text;
        this.priority = _priority;
        this.duedate = _duedate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

}
