package com.example.android.sanfernandovalleyattractions;

public class Location {

    public static final String TAG = Location.class.getSimpleName();

    private String primaryAddressNumber;
    private String  streetNameWithSuffix;
    private String cityName;
    private String UsState;
    private String UsZipCode;

    public String getPrimaryAddressNumber() {
        return primaryAddressNumber;
    }

    public void setPrimaryAddressNumber(String primaryAddressNumber) {
        this.primaryAddressNumber = primaryAddressNumber;
    }

    public String getStreetNameWithSuffix() {
        return streetNameWithSuffix;
    }

    public void setStreetNameWithSuffix(String streetNameWithSuffix) {
        this.streetNameWithSuffix = streetNameWithSuffix;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUsState() {
        return UsState;
    }

    public void setUsState(String usState) {
        UsState = usState;
    }

    public String getUsZipCode() {
        return UsZipCode;
    }

    public void setUsZipCode(String usZipCode) {
        UsZipCode = usZipCode;
    }

    public Location(String primaryAddressNumber, String streetNameWithSuffix, String cityName, String usState, String usZipCode) {
        this.primaryAddressNumber = primaryAddressNumber;
        this.streetNameWithSuffix = streetNameWithSuffix;
        this.cityName = cityName;
        UsState = usState;
        UsZipCode = usZipCode;
    }

    @Override public String toString() {
        return "Location{" +
                "primaryAddressNumber='" + primaryAddressNumber + '\'' +
                ", streetNameWithSuffix='" + streetNameWithSuffix + '\'' +
                ", cityName='" + cityName + '\'' +
                ", UsState='" + UsState + '\'' +
                ", UsZipCode='" + UsZipCode + '\'' +
                '}';
    }
}
