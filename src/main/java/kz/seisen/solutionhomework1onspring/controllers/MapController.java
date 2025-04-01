package kz.seisen.solutionhomework1onspring.controllers;

import kz.seisen.solutionhomework1onspring.models.flyweight.Marker;
import kz.seisen.solutionhomework1onspring.models.flyweight.MarkerStyleFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
class MapController {
    @GetMapping("/flyweight")
    public String showMap(Model model) {
        List<Marker> markers = new ArrayList<>();

        // Generating sample markers
        markers.add(new Marker(40.7128, -74.0060, MarkerStyleFactory.getMarkerStyle("hospital", "red", "bold")));
        markers.add(new Marker(34.0522, -118.2437, MarkerStyleFactory.getMarkerStyle("restaurant", "blue", "italic")));
        markers.add(new Marker(51.5074, -0.1278, MarkerStyleFactory.getMarkerStyle("gas", "green", "normal")));
        markers.add(new Marker(40.7306, -73.9352, MarkerStyleFactory.getMarkerStyle("restaurant", "blue", "italic")));

        model.addAttribute("markers", markers);
        model.addAttribute("uniqueStyles", MarkerStyleFactory.getUniqueStyleCount());
        model.addAttribute("totalMarkers", markers.size());
        return "map";
    }
}
