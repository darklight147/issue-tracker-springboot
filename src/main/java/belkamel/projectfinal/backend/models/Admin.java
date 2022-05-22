package belkamel.projectfinal.backend.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import belkamel.projectfinal.backend.tools.Values;

@Entity
@AttributeOverride(name = "user_id", column = @Column(name = "admin_id"))
@PrimaryKeyJoinColumn(name = "admin_id", referencedColumnName = "user_id")
public class Admin extends User {

    public Admin() {
        super();
        this.setRole(Values.getRole("admin"));
    }

    public Admin(String email, String displayName, String password) {
        super(email, displayName, password);
        this.setRole(Values.getRole("admin"));
    }
}
