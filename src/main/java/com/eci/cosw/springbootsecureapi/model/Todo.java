package com.eci.cosw.springbootsecureapi.model;

import java.time.LocalDate;
import java.util.Date;

public class Todo {
    private String text;
    private int priority;
    private LocalDate duedate;

    public Todo() {
        this("", 0, LocalDate.now());
    }

    public Todo(String _text, int _priority, LocalDate _duedate) {
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

    public String getDuedate() {
        System.out.println(duedate.toString());
        return duedate.toString();
    }

    public void setDuedate(String duedate) {
        this.duedate = LocalDate.parse(duedate);
    }

}
