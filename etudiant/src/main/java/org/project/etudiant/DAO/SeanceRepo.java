package org.project.etudiant.DAO;

import org.project.etudiant.entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepo extends JpaRepository<Seance, Long> {

}
