package belkamel.projectfinal.backend.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import belkamel.projectfinal.backend.models.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
    Optional<List<Ticket>> findByClientId(int id);

    Optional<List<Ticket>> findByDevId(int id);
}
