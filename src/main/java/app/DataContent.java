package app;

import java.util.List;

/**
 * Created by Damian on 02.07.2017.
 */
public class DataContent {
    private final NavBarData navbar;
    private final AboutData about;
    private final Competence competence;
    private final Experience experience;
    private final Hobby hobby;
    private final Contact contact;


    public DataContent( NavBarData navbar, AboutData about, Competence competence, Experience experience, Hobby hobby, Contact contact) {
        this.navbar = navbar;
        this.about = about;
        this.competence = competence;
        this.experience = experience;
        this.hobby = hobby;
        this.contact = contact;
    }

    public NavBarData getNavbar() {
        return navbar;
    }

    public AboutData getAbout() {
        return about;
    }

    public Competence getCompetence() {
        return competence;
    }

    public Experience getExperience() {
        return experience;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public Contact getContact() {
        return contact;
    }
}
