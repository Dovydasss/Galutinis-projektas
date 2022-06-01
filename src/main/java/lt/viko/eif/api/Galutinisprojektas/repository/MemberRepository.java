package lt.viko.eif.api.Galutinisprojektas.repository;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
