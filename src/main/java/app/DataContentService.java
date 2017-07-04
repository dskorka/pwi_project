package app;

import org.springframework.stereotype.Service;

/**
 * Created by Damian on 02.07.2017.
 */
@Service
public class DataContentService {

    private final DataContentRepo dataContentRepo;

    public DataContentService(DataContentRepo dataContentRepo) {
        this.dataContentRepo = dataContentRepo;
    }

    DataContent getDataContentByLanguage(String language){
        if(language.equals("DE")){
            return dataContentRepo.getDeVersion();
        } else {
            return dataContentRepo.getPlVersion();
        }
    }
}