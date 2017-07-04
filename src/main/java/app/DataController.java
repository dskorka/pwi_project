package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by Damian on 02.07.2017.
 */
@RestController
public class DataController {

    private final DataContentService service;

    public DataController(DataContentService service) {
        this.service = service;
    }

    @RequestMapping("/getDataContent")
    public DataContent getDataContent(@RequestParam(value = "language", required = false, defaultValue = "PL") String language){
        return service.getDataContentByLanguage(language);
    }

    @RequestMapping("/")
    public String getTest(){
        return "Hello World!";
    }
}
