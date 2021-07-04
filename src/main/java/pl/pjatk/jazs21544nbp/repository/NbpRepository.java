package pl.pjatk.jazs21544nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.jazs21544nbp.model.NbpRequest;

@Repository
public interface NbpRepository extends JpaRepository<NbpRequest, Long> {
}
