package KodlamaIo.Language.WebApi.Controlers;

import KodlamaIo.Language.bussines.abstracts.TeacherService;
import KodlamaIo.Language.bussines.requests.CreateTeacherRequest;
import KodlamaIo.Language.bussines.responses.GetAllTeacherResponse;

import KodlamaIo.Language.bussines.responses.GetIdTeacherResponseModel;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.PhantomReference;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/teacher")
@AllArgsConstructor
public class TeacherControler {
    private TeacherService teacherService;

    @GetMapping("getall")
    public List<GetAllTeacherResponse> getAll(){
        return teacherService.getall();
    }
    @PostMapping("add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@Valid @RequestBody CreateTeacherRequest createTeacherRequest){
        this.teacherService.add(createTeacherRequest);
    }
    @GetMapping("getById")
    public List< GetIdTeacherResponseModel> getById(){
        return teacherService.getById();
    }
}
