package kz.seisen.solutionhomework1onspring.models.proxy;


public class ProxyImage implements Image {
    private final String fileName;
    private HighResImage highResImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String display() {
        if (highResImage == null) {
            highResImage = new HighResImage(fileName);
        }
        return highResImage.display();
    }

    public String displayThumbnail() {
        return "/images/thumbnails/" + fileName; // Simulating a low-res version
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
