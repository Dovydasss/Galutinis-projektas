package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.exception.ResourceNotFoundException;
import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.repository.MissionRepository;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImpl implements MissionService {

    MissionRepository missionRepository;

    public MissionServiceImpl(MissionRepository missionRepository){this.missionRepository = missionRepository;}

    @Override
    public Mission saveMission(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public List<Mission> getAllMission() {
        return missionRepository.findAll();
    }

    @Override
    public void deleteMission(long id) {
        missionRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Mission", "id", id));
    }
}