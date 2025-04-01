package kz.seisen.solutionhomework1onspring.models.flyweight;

public class Marker {
    private final double latitude;
    private final double longitude;
    private final MarkerStyle style;

    public Marker(double latitude, double longitude, MarkerStyle style) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.style = style;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public MarkerStyle getStyle() { return style; }
}