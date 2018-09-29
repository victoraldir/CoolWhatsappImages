package com.quartzo.xyzreader.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "item")
public class Item {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private final Long id;

    @NonNull
    private final String title;

    @NonNull
    private final String photoUrl;

    private final String category;

    public Item(Long id, String title, String photoUrl, String category) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getCategory() {
        return category;
    }
}
