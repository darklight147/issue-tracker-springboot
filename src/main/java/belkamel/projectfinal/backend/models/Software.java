package belkamel.projectfinal.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Software {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "software_id")
    private int id;
    private String name;
}
