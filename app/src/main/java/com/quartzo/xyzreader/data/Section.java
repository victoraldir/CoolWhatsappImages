package com.quartzo.xyzreader.data;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by victoraldir on 16/12/2017.
 */

@Entity(tableName = "section")
public class Section {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private final Long id;

    @NonNull
    private final String label;

    @NonNull
    private final Integer order;

    public Section(Long id, String label, Integer order) {
        this.id = id;
        this.label = label;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public Integer getOrder() {
        return order;
    }
}
