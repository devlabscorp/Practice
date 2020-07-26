package practice.home.behavioralpatterns.command;

public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String close() {
        return "Closing file " + name;
    }
}
