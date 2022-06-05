package lt.viko.eif.api.Galutinisprojektas.repository;

import lt.viko.eif.api.Galutinisprojektas.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * All of the Team CRUD (Create, read, update, and delete) operations
 */

public interface TeamRepository extends JpaRepository<Team, Long> {
}
