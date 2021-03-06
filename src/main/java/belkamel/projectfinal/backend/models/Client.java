package belkamel.projectfinal.backend.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import belkamel.projectfinal.backend.tools.Values;

@Entity
@AttributeOverride(name = "user_id", column = @Column(name = "client_id"))
@PrimaryKeyJoinColumn(name = "client_id", referencedColumnName = "user_id")
public class Client extends User {

    public Client() {
        super();
        this.setRole(Values.getRole("client"));
    }

    public Client(String email, String displayName, String password) {
        super(email, displayName, password);
        this.setRole(Values.getRole("client"));
    }
}
