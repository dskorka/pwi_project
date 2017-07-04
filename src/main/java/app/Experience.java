package app;

import java.util.List;

/**
 * Created by Damian on 02.07.2017.
 */
public class Experience {

    private String title;
    private List<String> description;

    public Experience(String title, List<String> description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getDescription() {
        return description;
    }
}
