package app;

/**
 * Created by Damian on 02.07.2017.
 */
public class Hobby {

    private String title;
    private String description1;
    private String description2;

    public Hobby(String title, String description1, String description2) {
        this.title = title;
        this.description1 = description1;
        this.description2 = description2;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription1() {
        return description1;
    }

    public String getDescription2() {
        return description2;
    }
}
