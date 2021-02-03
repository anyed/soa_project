package org.project.teacher.repository;

import org.project.teacher.entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Enseignant, Long> {
    Enseignant findEnseignantByCin(Long CIN);
    Enseignant findEnseignantByFullName(String FullName);
    void deleteEnseignantByCin(Long CIN);
}
