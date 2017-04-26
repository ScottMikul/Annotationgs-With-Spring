package com.teamtreehouse.giflib.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scott on 4/24/2017.
 */
public class Gif {
    private String name;
    private int categoryId;
    private LocalDate localDate;
    private boolean favorite;
    private String username;

    public Gif(String name, int categoryId, LocalDate localDate, String username, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.localDate = localDate;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


}
