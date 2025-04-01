package kz.seisen.solutionhomework1onspring.models.flyweight;

public class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public String getIcon() { return icon; }
    public String getColor() { return color; }
    public String getLabelStyle() { return labelStyle; }
}