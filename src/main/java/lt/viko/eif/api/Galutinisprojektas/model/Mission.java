package lt.viko.eif.api.Galutinisprojektas.model;

import com.squareup.okhttp.*;
import lombok.Data;
import okio.*;

import javax.persistence.*;
import java.io.*;

@Entity
public class Mission{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "teamId")
    private Integer teamId;
    @Column(name = "Location")
    private String Location;
}
