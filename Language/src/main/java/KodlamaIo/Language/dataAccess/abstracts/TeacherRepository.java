package KodlamaIo.Language.dataAccess.abstracts;

import KodlamaIo.Language.Entities.concretes.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
