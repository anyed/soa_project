package org.project.etudiant.Service;

import org.project.etudiant.entity.Seance;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface AssiduiteServices {
    Seance ajouterSeance(Seance seance);
    Seance findSeanceByDateAndSubject(String Subject, Date date);
    List<Seance> findSeanceByTeacher(String teacher);
    List<Seance> findSeancesByStudent(String student);
    void deleteSeance(Long id);

}
