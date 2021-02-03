package org.project.etudiant.DAO;

import org.project.etudiant.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Date;

@RepositoryRestController
public interface ExamRepo extends JpaRepository<Exam, Long> {
    void deleteExamBySubjectAndExamDate(String Subject, Date date);
    Exam findExamByCinStudent(Long CIN);
}
