package lt.viko.eif.api.Galutinisprojektas.repository;

import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * All of the Mission CRUD (Create, read, update, and delete) operations
 */

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
