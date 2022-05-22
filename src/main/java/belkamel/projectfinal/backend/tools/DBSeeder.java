package belkamel.projectfinal.backend.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import belkamel.projectfinal.backend.models.Admin;
import belkamel.projectfinal.backend.models.Client;
import belkamel.projectfinal.backend.models.Dev;
import belkamel.projectfinal.backend.repo.UserRepo;

@Component
public class DBSeeder implements CommandLineRunner {

    @Autowired
    private UserRepo<Admin> aRepo;
    @Autowired
    private UserRepo<Dev> dRepo;
    @Autowired
    private UserRepo<Client> cRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (aRepo.findAll().isEmpty()) {
            Admin admin = new Admin();
            admin.setDisplayName("admin");
            admin.setEmail("admin@mail.com");
            admin.setPassword(passwordEncoder.encode("admin"));
            admin.setRole(Values.getRole("admin"));
            aRepo.save(admin);

            Client client = new Client();
            client.setDisplayName("nejm");
            client.setEmail("nejm@mail.com");
            client.setPassword(passwordEncoder.encode("nejm"));
            client.setRole(Values.getRole("client"));
            cRepo.save(client);
        
            Dev dev = new Dev();
            dev.setDisplayName("ahid");
            dev.setEmail("ahid@mail.com");
            dev.setPassword(passwordEncoder.encode("ahid"));
            dev.setRole(Values.getRole("dev"));
            dRepo.save(dev);
        }
    }

}

