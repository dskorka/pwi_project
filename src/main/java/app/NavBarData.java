package app;

/**
 * Created by Damian on 02.07.2017.
 */
public class NavBarData {

    private String about;
    private String competence;
    private String experience;
    private String hobby;
    private String contact;

    public NavBarData(String about, String competence, String experience, String hobby, String contact) {
        this.about = about;
        this.competence = competence;
        this.experience = experience;
        this.hobby = hobby;
        this.contact = contact;
    }

    public String getAbout() {
        return about;
    }

    public String getCompetence() {
        return competence;
    }

    public String getExperience() {
        return experience;
    }

    public String getHobby() {
        return hobby;
    }

    public String getContact() {
        return contact;
    }
}
