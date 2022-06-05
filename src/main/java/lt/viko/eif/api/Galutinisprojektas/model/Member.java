package lt.viko.eif.api.Galutinisprojektas.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthDate")
    private Date birthDate;


}
