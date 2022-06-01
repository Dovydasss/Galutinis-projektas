package lt.viko.eif.api.Galutinisprojektas.repository;

import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
