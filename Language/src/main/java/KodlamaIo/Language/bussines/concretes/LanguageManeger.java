package KodlamaIo.Language.bussines.concretes;

import KodlamaIo.Language.Entities.concretes.Language;
import KodlamaIo.Language.Mapping.ModelMapperService;
import KodlamaIo.Language.bussines.abstracts.LanguageService;
import KodlamaIo.Language.bussines.requests.CreateLanguageRequest;
import KodlamaIo.Language.bussines.responses.GetIdLanguageResponseModel;
import KodlamaIo.Language.bussines.responses.getAllLanguageResponse;
import KodlamaIo.Language.dataAccess.abstracts.LanguageRepository;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LanguageManeger implements LanguageService {

    private LanguageRepository languageRepesitory;
    private ModelMapperService modelMapperService;




    @Override
    public List<getAllLanguageResponse> getAll() {
       // List<Language> languages=languageRepesitory.findAll();
      //List<getAllLanguageResponse> languageResponses =new ArrayList<getAllLanguageResponse>();
      //for(Language language:languages )
     // {
       //   getAllLanguageResponse response = new getAllLanguageResponse();
        //  response.setId(language.getId());
       //   response.setName(language.getName());
        //  languageResponses.add(response);

    //  }
      //  return languageResponses;
        List<Language> languages= languageRepesitory.findAll();

        List<getAllLanguageResponse> languageResponses= languages.stream().
                map(language -> this.modelMapperService.forResponse()
                        .map(language ,getAllLanguageResponse.class)).toList();
        return languageResponses;
    }
    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {

        Language language= this.modelMapperService.forRequest().map(createLanguageRequest ,Language.class);
        this.languageRepesitory.save(language);
    }
    @Override
    public void update(Language language ) {
    Language l = new Language();
     l.setName(language.getName());
     l.setId(language.getId());
     this.languageRepesitory.save(l);
    }

    @Override
    public List<GetIdLanguageResponseModel> getById(int id) {
        List<Language> languages= languageRepesitory.findAll();

        List<GetIdLanguageResponseModel> languageResponsesId= languages.stream().
                map(language -> this.modelMapperService.forResponse()
                        .map(language ,GetIdLanguageResponseModel.class)).toList();
        return languageResponsesId;
    }


    @Override
    public void delete(int id) {
        this.languageRepesitory.deleteById(id);
    }


}
