package week7.assignmentproblems;
class Art {
    String title;
    String artist;

    Art(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Artist: " + artist);
    }
}

class Painting extends Art {
    String brushTechniques;
    String colorPalette;
    String frame;

    Painting(String title, String artist, String brushTechniques, String colorPalette, String frame) {
        super(title, artist);
        this.brushTechniques = brushTechniques;
        this.colorPalette = colorPalette;
        this.frame = frame;
    }

    void paintingDetails() {
        System.out.println("Brush Techniques: " + brushTechniques + ", Colors: " + colorPalette + ", Frame: " + frame);
    }
}

class Sculpture extends Art {
    String material;
    String dimensions;
    String lighting;

    Sculpture(String title, String artist, String material, String dimensions, String lighting) {
        super(title, artist);
        this.material = material;
        this.dimensions = dimensions;
        this.lighting = lighting;
    }

    void sculptureDetails() {
        System.out.println("Material: " + material + ", Dimensions: " + dimensions + ", Lighting: " + lighting);
    }
}

class DigitalArt extends Art {
    String resolution;
    String fileFormat;
    boolean interactive;

    DigitalArt(String title, String artist, String resolution, String fileFormat, boolean interactive) {
        super(title, artist);
        this.resolution = resolution;
        this.fileFormat = fileFormat;
        this.interactive = interactive;
    }

    void digitalDetails() {
        System.out.println("Resolution: " + resolution + ", Format: " + fileFormat + ", Interactive: " + interactive);
    }
}

class Photography extends Art {
    String cameraSettings;
    String editingDetails;
    String printSpecs;

    Photography(String title, String artist, String cameraSettings, String editingDetails, String printSpecs) {
        super(title, artist);
        this.cameraSettings = cameraSettings;
        this.editingDetails = editingDetails;
        this.printSpecs = printSpecs;
    }

    void photographyDetails() {
        System.out.println("Camera: " + cameraSettings + ", Editing: " + editingDetails + ", Print: " + printSpecs);
    }
}

public class ArtGallery {
    public static void main(String[] args) {
        Art[] gallery = {
                new Painting("Sunset Bliss", "Alice", "Oil", "Warm", "Wooden"),
                new Sculpture("The Thinker", "Bob", "Bronze", "2m x 1m", "Spotlight"),
                new DigitalArt("Virtual Dream", "Charlie", "4K", "MP4", true),
                new Photography("Mountain Peaks", "Diana", "ISO 200, f/8", "Lightroom edits", "A3 Print")
        };

        for (Art a : gallery) {
            a.displayInfo();

            if (a instanceof Painting) {
                ((Painting) a).paintingDetails();
            } else if (a instanceof Sculpture) {
                ((Sculpture) a).sculptureDetails();
            } else if (a instanceof DigitalArt) {
                ((DigitalArt) a).digitalDetails();
            } else if (a instanceof Photography) {
                ((Photography) a).photographyDetails();
            }

            System.out.println();
        }
    }
}

