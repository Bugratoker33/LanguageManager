package KodlamaIo.Language.Entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "techers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private  String surname;
    @Column(name = "age")
    private  int age;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language  language;

}
