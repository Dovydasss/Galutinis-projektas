package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.repository.MissionRepository;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import org.springframework.stereotype.Service;

@Service
public class MissionServiceImpl implements MissionService {

    MissionRepository missionRepository;

    public MissionServiceImpl(MissionRepository missionRepository){this.missionRepository = missionRepository;}

    @Override
    public Mission saveMission(Mission mission) {
        return null;
    }
}
