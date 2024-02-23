package KodlamaIo.Language.bussines.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CreateTeacherRequest {

    private String name;
    private String surname;
    private int age;

    private int languageId;
}
