package io.kholley.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private String latiLongi;
    private int latestTotalCases;
    private int diffFromPreviousDay;


    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public String getLatiLongi() {
        return latiLongi;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public void setLatLong(String lati, String longi) {
        this.latiLongi = lati + "," + longi;
    }



    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", lat/long='" + latiLongi + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
