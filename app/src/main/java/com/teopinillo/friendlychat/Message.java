package com.teopinillo.friendlychat;

import androidx.recyclerview.widget.RecyclerView;

public class Message  {
    String text;
    String name;
    String photoUrl;

    public Message(String text, String name, String photoUrl) {
        super();
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public Message() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
