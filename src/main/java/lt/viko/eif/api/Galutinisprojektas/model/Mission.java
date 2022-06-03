package lt.viko.eif.api.Galutinisprojektas.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Mission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "teamId")
    private Integer teamId;
    @Column(name = "Location")
    private String Location;
}
