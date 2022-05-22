package belkamel.projectfinal.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import belkamel.projectfinal.backend.models.Software;

public interface SoftwareRepo extends JpaRepository<Software, Integer> {

}
