package kz.seisen.solutionhomework1onspring.models;

public class HighResImage implements Image {
    private final String fileName;

    public HighResImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image: " + fileName);
    }

    @Override
    public String display() {
        return "/images/" + fileName; // Path to the full image
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}