package KodlamaIo.Language.WebApi.Controlers;

import KodlamaIo.Language.Entities.concretes.Language;
import KodlamaIo.Language.bussines.abstracts.LanguageService;
import KodlamaIo.Language.bussines.requests.CreateLanguageRequest;
import KodlamaIo.Language.bussines.responses.GetIdLanguageResponseModel;
import KodlamaIo.Language.bussines.responses.getAllLanguageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
    @RestController
    @RequestMapping("/api/language")
    public class LanguagesController {
        private LanguageService languageService;

      //  @Autowired
        public LanguagesController(LanguageService languageService) {
            this.languageService = languageService;
        }

        @GetMapping("/getall")
        public List<getAllLanguageResponse> getAll(){
            return languageService.getAll();
        }

        @PostMapping()
        @ResponseStatus(code = HttpStatus.CREATED) //201 çıktısı olucak çünkü 201 aldığımızda bir veri oluştu demek :
        public void add(CreateLanguageRequest language){
            this.languageService.add(language);
        }
        @PutMapping
        public void update(@RequestBody Language language2 ) {
            this.languageService.update(language2);
        }
        @DeleteMapping("/{id}")
        //patvariabel arayüzdeki id alsın diye
        public void delete( @PathVariable int id){
         this.languageService.delete(id);

        }

        @GetMapping("getById")
        public List<GetIdLanguageResponseModel> getById(int id){
            return languageService.getById(id);
        }
    }

