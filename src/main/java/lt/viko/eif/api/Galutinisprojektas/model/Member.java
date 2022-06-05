package lt.viko.eif.api.Galutinisprojektas.model;

import com.squareup.okhttp.*;
import lombok.Data;
import okio.*;

import javax.persistence.*;
import java.io.*;
import java.sql.Date;


@Entity
public class Member{
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
