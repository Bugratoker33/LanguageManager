package KodlamaIo.Language.Entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "languages")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "language")
    private List<Teacher> teachers;




}
