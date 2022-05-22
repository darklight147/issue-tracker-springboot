package belkamel.projectfinal.backend.services;

import java.util.List;

import belkamel.projectfinal.backend.models.Software;

public interface SoftwareService {
    Software add(Software software);

    Software update(Software software);

    Software delete(Software software);

    Software findById(int id);

    List<Software> findAll();
}
