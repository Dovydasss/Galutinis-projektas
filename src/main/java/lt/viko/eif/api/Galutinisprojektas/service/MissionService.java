package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.model.Mission;

import java.util.List;

public interface MissionService {
    Mission saveMission(Mission mission);
    List<Mission> getAllMission();
    void deleteMission(long id);

}
