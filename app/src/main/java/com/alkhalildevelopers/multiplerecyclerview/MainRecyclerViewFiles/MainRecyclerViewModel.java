package com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles;

public class MainRecyclerViewModel {
    private int viewType;

    public static final int ImageLayoutType = 0;
    public static final int AdTextLayoutType = 1;

    public MainRecyclerViewModel(int viewType) {
        this.viewType = viewType;
    }

    ///ImageLayout
    private int ImageResourse;

    public MainRecyclerViewModel(int viewType, int imageResourse) {
        this.viewType = viewType;
        ImageResourse = imageResourse;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public int getImageResourse() {
        return ImageResourse;
    }

    public void setImageResourse(int imageResourse) {
        ImageResourse = imageResourse;
    }
    ///ImageLayout

    ///AdText Layout
    private String adText;

    public MainRecyclerViewModel(int viewType, String adText) {
        this.viewType = viewType;
        this.adText = adText;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }
    ///AdText Layout
}
