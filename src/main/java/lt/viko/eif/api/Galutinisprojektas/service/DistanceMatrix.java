package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.*;
import org.json.simple.parser.ParseException;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

/**
 * This interface is used for creating methods, which
 * execute basic operations to the database.
 */

public interface DistanceMatrix {

    String getDistance(String teamCity, String missionCity);
}
