package KodlamaIo.Language.dataAccess.abstracts;

import KodlamaIo.Language.Entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LanguageRepository extends JpaRepository<Language ,Integer> {

}
