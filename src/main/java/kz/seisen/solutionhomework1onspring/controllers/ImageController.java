package kz.seisen.solutionhomework1onspring.controllers;

import kz.seisen.solutionhomework1onspring.models.ProxyImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ImageController {

    @GetMapping("/")
    public String showImages(Model model) {
        List<ProxyImage> images = List.of(
                new ProxyImage("house1.jpg"),
                new ProxyImage("house2.jpg"),
                new ProxyImage("house3.jpg")
        );
        model.addAttribute("images", images);
        return "index";
    }
}
