package com.example.chat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Massage implements Serializable {
   private   String massage;
   private String name ;
   private Date date;

    private SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public Massage(String name, String massage) {
        this.massage = massage;
        this.name = name;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return format.format(date) + " : "+ name +"--"+ massage;
    }
}
