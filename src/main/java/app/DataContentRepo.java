package app;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by Damian on 02.07.2017.
 */
@Component
public class DataContentRepo {

    public DataContent getDeVersion() {
        NavBarData navBarData = new NavBarData("Über mich","Wissen","Erfahrung","Interessen","Fühlung");

        AboutData aboutData = new AboutData("Über mich", "Hallo, mein Name ist Damian Skórka, "
                + "Ich bin 26 Jahre alt. "
                + "Ich bin ein Student in der Schule des Lebens auf dem Computer. "
                + "In der Programmierung für mehrere Jahre interessiert. "
                + "Aber erst seit dem kommerziellen Geschäft in der Programmiersprache Java. "
                + "Leidenschaft für Technologie hauptsächlich beckendowymi und Datenbanken. "
                + "Good Practices Enthusiasten Programmierung wie TDD, FEST, DDD, und die funktionale Programmierung.");


        String competence = "Von dem, was ich";
        Competence competenceObj = new Competence(competence, getCompetenceMap());


        List<String> description = new ArrayList();
        description.add("Junior Java Developer (2016.09 - obecnie)");
        description.add("Spezialist für. entwicklung CRM i ERP (2015.01 - 2016.08)");

        Experience experience = new Experience("Erfahrung", description);

        Hobby hobby = new Hobby("Interessen",
                "Mein größtes Hobby ist die Modellierung, die mich von der täglichen Arbeit weg erhalten können. " +
                        "Vollständig absorbiert meine Konzentration, die effizienter sein kann, wenn die Programmierung Probleme zu lösen.",
                "Seit vielen Jahren fasziniert das Aquarium mich.");

        List<String> description1 = new ArrayList<>();
        description1.add("Damian Skórka");
        description1.add("E-Mail: damian@skorka.com");
        description1.add("Tel. +48 123 456 789");

        Contact contact = new Contact("Fühlung",description1);

        return new DataContent(navBarData,aboutData,competenceObj,experience,hobby,contact);
    }

    public DataContent getPlVersion() {

        NavBarData navBarData = new NavBarData("O mnie","Umiejętności","Doświadczenie","Zainteresowania","Kontakt");

        AboutData aboutData = new AboutData("O mnie", "Cześć, nazywam się Damian Skórka, "
                + "mam 26 lat. "
                + "Jestem studentem w Szkole Głównej Gospodarstwa Wiejskiego na kierunku informatyka. "
                + "Programowaniem intereuję się od kilku lat. "
                + "Ale dopiero od roku zajmuję sie komercyjnym programowaniem w języku Java. "
                + "Pasjonuję się technologiami głownie beckendowymi oraz bazami danych. "
                + "Entuzjasta dobrych praktych programowania takich jak TDD, SOLID, DDD oraz programowania funkcyjnego.");

        String competence = "Z czego korzystam";
        Competence competenceObj = new Competence(competence, getCompetenceMap());

        List<String> description = new ArrayList();
        description.add("Junior Java Developer (2016.09 - obecnie)");
        description.add("Specjalista ds. rozwoju CRM i ERP (2015.01 - 2016.08)");

        Experience experience = new Experience("Doświadczenie", description);

        Hobby hobby = new Hobby("Zainteresowania",
                "Głównym moim hobby jest modelarstwo, które pozwala mi oderwać się od codzienej pracy. " +
                        "Całkowicie pochłania moją koncentrację, przez co mogę być bardziej wydajny podczas rozwiązywania programistycznych problemów.",
                "Od wielu lat również pasjonuje mnie akwarystyka.");

        List<String> description1 = new ArrayList<>();
        description1.add("Damian Skórka");
        description1.add("E-Mail: damian@skorka.com");
        description1.add("Tel. +48 123 456 789");

        Contact contact = new Contact("Kontakt",description1);

       return new DataContent(navBarData,aboutData,competenceObj,experience,hobby,contact);
    }

    private Map<String, Integer> getCompetenceMap(){
        Map<String,Integer> competenceMap = new HashMap<>();
        competenceMap.put("Java 8", 80);
        competenceMap.put("Scala", 50);
        competenceMap.put("Spring 4", 75);
        competenceMap.put("Thymeleaf", 65);
        competenceMap.put("ORM - JPA/Hibernate", 65);
        competenceMap.put("HTML", 55);
        competenceMap.put("CSS", 55);
        competenceMap.put("Bootstrap", 65);
        competenceMap.put("Angular 2", 70);
        competenceMap.put("MSSQL", 80);
        competenceMap.put("MySql", 80);
        competenceMap.put("JUnit", 75);
        competenceMap.put("Mockito", 75);

        return competenceMap;
    }
}
