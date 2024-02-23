package KodlamaIo.Language.bussines.abstracts;

import KodlamaIo.Language.Entities.concretes.Language;
import KodlamaIo.Language.bussines.requests.CreateLanguageRequest;
import KodlamaIo.Language.bussines.responses.GetIdLanguageResponseModel;
import KodlamaIo.Language.bussines.responses.getAllLanguageResponse;

import java.util.List;

public interface LanguageService {
    List<getAllLanguageResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest);
    void update ( Language language  );
     List<GetIdLanguageResponseModel> getById(int id);
    void delete (int id );

}
