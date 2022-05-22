package belkamel.projectfinal.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import belkamel.projectfinal.backend.models.Client;
import belkamel.projectfinal.backend.models.Ticket;
import belkamel.projectfinal.backend.services.TicketService;
import belkamel.projectfinal.backend.services.UserService;
import belkamel.projectfinal.backend.tools.Values;

@RestController
@RequestMapping(Values.API_PREFIX + "/clients")
public class ClientController {
    
    @Autowired
    private UserService<Client> userService;
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Client>> getAll() {
        return ResponseEntity.ok(userService.findByRole(Values.getRole("client")));
    }
    
    @PostMapping
    public ResponseEntity<Client> add(@RequestBody Client client) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.add(client));
    }

    @PostMapping("/tickets")
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(ticketService.add(ticket));
    }

    @GetMapping("/{client_id}/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(@PathVariable("client_id") int client_id) {
        return ResponseEntity.ok(ticketService.findByClientId(client_id));
    }
}

