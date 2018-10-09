package derekokelly.nuigalway.ie.gps_app;

public class LocationData {

    public double latitude;
    public double longitude;

    private LocationData() {}

    public LocationData(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
}
