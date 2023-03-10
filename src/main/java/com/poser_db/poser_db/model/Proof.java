package com.poser_db.poser_db.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Proof {
    @Id
    private String id;
    private String url;
    private String title;
    private List<String> sharers;
    private int timesShared;
    private String pointer;

    public Proof() {}

    public Proof(String url, String title, List<String> sharers, int timesShared, String pointer)
    {
        this.url = url;
        this.title = title;
        this.sharers = sharers;
        this.timesShared = timesShared;
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return "Proof [id=" + id + ", url=" + url + ", title=" + title + ", sharers=" + sharers + ", timesShared="
                + timesShared + ", pointer=" + pointer + "]";
    }

    
}
