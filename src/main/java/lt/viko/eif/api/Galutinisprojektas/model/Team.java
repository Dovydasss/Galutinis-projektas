package lt.viko.eif.api.Galutinisprojektas.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Team model class.
 */

@Data
@Entity
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "teamName")
    private String teamName;
    @Column(name = "member1")
    private Integer memberId1;
    @Column(name = "member2")
    private Integer memberId2;
    @Column(name = "member3")
    private Integer memberId3;
    @Column(name = "member4")
    private Integer memberId4;
    @Column(name = "member5")
    private Integer memberId5;



}
