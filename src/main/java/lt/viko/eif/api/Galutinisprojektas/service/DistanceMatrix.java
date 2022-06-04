package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.model.Team;

public interface DistanceMatrix {
    String getDistance(String teamCity, String missionCitu) throws Exception;

}
