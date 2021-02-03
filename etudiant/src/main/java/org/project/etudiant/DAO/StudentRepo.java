package org.project.etudiant.DAO;

import org.project.etudiant.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface StudentRepo extends JpaRepository<Student, Long> {
    void deleteStudentByCIN(Long CIN);

    Student findStudentByCIN(Long CIN);

    Student findStudentByFullName(String FullName);
    Long countAllByResult(String Result);
}
