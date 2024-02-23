package KodlamaIo.Language.bussines.responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetIdTeacherResponseModel {
    private  int id;

    private String name;

    private  String surname;

    private  int age;
    private  int languageId;
    private String languageName;


}
