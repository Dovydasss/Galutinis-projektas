package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.model.Team;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface DistanceMatrix {

    String getDistance(String teamCity, String missionCity);

}
