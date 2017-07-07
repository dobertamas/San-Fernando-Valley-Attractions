package com.example.android.sanfernandovalleyattractions;

public class Attraction {

    /**
     * The name of the given Attraction.
     */
    private String mName;
    /**
     * The address you can associate with the given Attraction to be used on a maps app or on Waze to get there
     */
    private String mAddress;

    /**
     * Overview/mDescription about the given Attraction
     */
    private String mDescription;

    /**
     * A URL to visit to get more info about the given Attraction.
     */
    private String mWebSiteUrl;

    /**
     * The resource ID to locate the image associated with the given Attraction.
     * The resource ID can be null.
     */
    private int mImageResourceId;

    public Attraction(String name, String address, String description, String webSiteUrl, int imageResourceId) {
        this.mName = name;
        this.mAddress = address;
        this.mDescription = description;
        this.mWebSiteUrl = webSiteUrl;
        mImageResourceId = imageResourceId;
    }

    public Attraction(String name, String address, String description, String webSiteUrl) {
        this.mName = name;
        this.mAddress = address;
        this.mDescription = description;
        this.mWebSiteUrl = webSiteUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getWebSiteUrl() {
        return mWebSiteUrl;
    }

    public void setWebSiteUrl(String webSiteUrl) {
        this.mWebSiteUrl = webSiteUrl;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    @Override public String toString() {
        return "Attraction{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mWebSiteUrl='" + mWebSiteUrl + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
