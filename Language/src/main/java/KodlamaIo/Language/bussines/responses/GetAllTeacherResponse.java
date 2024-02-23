package KodlamaIo.Language.bussines.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTeacherResponse {

    private int id;
    private String name;
    private String Surname;
    private int age;
    private String languageName;

}
