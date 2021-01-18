package repository;

import entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Enseignant, Long> {
    Enseignant findEnseignantByCin(Long CIN);
    Enseignant findEnseignantByFullName(String FullName);
    void deleteEnseignantByCin(Long CIN);
}
