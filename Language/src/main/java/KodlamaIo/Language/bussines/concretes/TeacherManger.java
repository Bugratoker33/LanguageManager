package KodlamaIo.Language.bussines.concretes;

import KodlamaIo.Language.Entities.concretes.Language;
import KodlamaIo.Language.Entities.concretes.Teacher;
import KodlamaIo.Language.Mapping.ModelMapperService;
import KodlamaIo.Language.bussines.abstracts.TeacherService;
import KodlamaIo.Language.bussines.requests.CreateTeacherRequest;
import KodlamaIo.Language.bussines.responses.GetAllTeacherResponse;
import KodlamaIo.Language.bussines.responses.GetIdLanguageResponseModel;

import KodlamaIo.Language.bussines.responses.GetIdTeacherResponseModel;
import KodlamaIo.Language.bussines.responses.getAllLanguageResponse;
import KodlamaIo.Language.dataAccess.abstracts.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeacherManger implements TeacherService {
    private TeacherRepository teacherRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllTeacherResponse> getall() {
        List<Teacher> teachers = teacherRepository.findAll();

        List<GetAllTeacherResponse> getAllTeacherResponses =teachers.stream()
                .map(teacher -> this.modelMapperService.forResponse()
                        .map(teacher ,GetAllTeacherResponse.class)).toList();
        return getAllTeacherResponses;
    }
    @Override
    public List< GetIdTeacherResponseModel> getById( ) {
        List<Teacher> teachers= this.teacherRepository.findAll();

       List< GetIdTeacherResponseModel> teacherList= teachers.stream().map(teacher -> this.modelMapperService.forResponse().map(teacher ,GetIdTeacherResponseModel.class)).toList();

        return teacherList;
    }


    @Override
    public void add(CreateTeacherRequest createTeacherRequest) {
        Teacher teacher= this.modelMapperService.forRequest().map(createTeacherRequest ,Teacher.class);
        this.teacherRepository.save(teacher);
    }

}
