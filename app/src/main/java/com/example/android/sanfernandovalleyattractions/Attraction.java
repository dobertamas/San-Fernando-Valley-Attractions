package com.example.android.sanfernandovalleyattractions;

class Attraction {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * The name of the given Attraction.
     */
    private String mName;
    /**
     * The location with all the details as an object.
     */
    private Location mLocation;
    /**
     * Overview/description about the given Attraction
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

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    String getDescription() {
        return mDescription;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    Attraction(String name, Location location, String description, String webSiteUrl, int imageResourceId) {
        mName = name;
        mLocation = location;
        mDescription = description;
        mWebSiteUrl = webSiteUrl;
        mImageResourceId = imageResourceId;
    }

    @Override public String toString() {

        if (mName != null && mLocation != null && mDescription != null && mWebSiteUrl != null) {
            return "Attraction{" +
                    "mName='" + mName + '\'' +
                    ", mLocation=" + mLocation.toString() +
                    ", mDescription='" + mDescription + '\'' +
                    ", mWebSiteUrl='" + mWebSiteUrl + '\'' +
                    ", mImageResourceId=" + mImageResourceId +
                    '}';
        }
        else return "";
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
