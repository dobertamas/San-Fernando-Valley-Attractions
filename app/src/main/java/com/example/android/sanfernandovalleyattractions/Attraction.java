package com.example.android.sanfernandovalleyattractions;

public class Attraction {

    /**
     * The address you can associate with the given Attraction to be used on a maps app or on Waze to get there
     */
    private String mAddress;

    /**
     * Overview/description about the given Attraction
     */
    private String description;

    /**
     * A URL to visit to get more info about the given Attraction.
     */
    private String webSiteUrl;

    /**
     * The resource ID to locate the image associated with the given Attraction.
     * The resource ID can be null.
     */
    private int mImageResourceId;

    public Attraction(String address, String description, String webSiteUrl) {
        mAddress = address;
        this.description = description;
        this.webSiteUrl = webSiteUrl;
    }

    public Attraction(String address, String description, int imageResourceId, String webSiteUrl) {
        this.mAddress = address;
        this.description = description;
        this.mImageResourceId = imageResourceId;
        this.webSiteUrl = webSiteUrl;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    public String getWebSiteUrl() {
        return webSiteUrl;
    }

    public void setWebSiteUrl(String webSiteUrl) {
        this.webSiteUrl = webSiteUrl;
    }
}
