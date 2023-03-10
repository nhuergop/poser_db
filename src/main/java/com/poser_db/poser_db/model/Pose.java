package com.poser_db.poser_db.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "poses")
public class Pose {
    @Id
    private String id;
    private String url;
    private String title;
    private List<String> sharers;
    private List<Proof> veraz;
    private List<Proof> mendaz;
    private int verazCount;
    private int mendazCount;
    private int timesShared;

    public Pose() {}

    public Pose(String url, String title, List<String> sharers, List<Proof> veraz, List<Proof> mendaz, int verazCount, int mendazCount, int timesShared)
    {
        this.url = url;
        this.title = title;
        this.sharers = sharers;
        this.veraz = veraz;
        this.mendaz = mendaz;
        this.verazCount = verazCount;
        this.mendazCount = mendazCount;
        this.timesShared = timesShared;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Pose [id=" + id + ", url=" + url + ", title=" + title + ", sharers=" + sharers + ", veraz=" + veraz
                + ", mendaz=" + mendaz + ", verazCount=" + verazCount + ", mendazCount=" + mendazCount
                + ", timesShared=" + timesShared + "]";
    }
}
