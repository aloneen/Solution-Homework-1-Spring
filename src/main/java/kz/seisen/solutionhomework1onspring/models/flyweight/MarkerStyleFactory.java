package kz.seisen.solutionhomework1onspring.models.flyweight;

import java.util.ArrayList;
import java.util.List;

public class MarkerStyleFactory {
    private static final List<MarkerStyle> styles = new ArrayList<>();

    public static MarkerStyle getMarkerStyle(String icon, String color, String labelStyle) {
        for (MarkerStyle style : styles) {
            if (style.getIcon().equals(icon) && style.getColor().equals(color) && style.getLabelStyle().equals(labelStyle)) {
                return style;
            }
        }
        MarkerStyle newStyle = new MarkerStyle(icon, color, labelStyle);
        styles.add(newStyle);
        return newStyle;
    }

    public static int getUniqueStyleCount() {
        return styles.size();
    }
}
