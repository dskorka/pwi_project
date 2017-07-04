package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Damian on 02.07.2017.
 */
@SpringBootApplication(scanBasePackages = "app")
public class pwi_projectApp {
    public static void main(String[] args){
        SpringApplication.run(pwi_projectApp.class, args);
    }
}
