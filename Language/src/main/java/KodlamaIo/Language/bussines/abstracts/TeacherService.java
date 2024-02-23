package KodlamaIo.Language.bussines.abstracts;


import KodlamaIo.Language.bussines.requests.CreateTeacherRequest;
import KodlamaIo.Language.bussines.responses.GetAllTeacherResponse;

import KodlamaIo.Language.bussines.responses.GetIdTeacherResponseModel;

import java.util.List;

public interface TeacherService {

    List<GetAllTeacherResponse> getall();
   List< GetIdTeacherResponseModel> getById( );
    void add(CreateTeacherRequest createTeacherRequest);
}
