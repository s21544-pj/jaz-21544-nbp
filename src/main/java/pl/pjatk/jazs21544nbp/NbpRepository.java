package pl.pjatk.jazs21544nbp;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.jazs21544nbp.model.NbpRequest;

public interface NbpRepository extends JpaRepository<NbpRequest, Long> {
}
