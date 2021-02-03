package org.project.etudiant.Service;

import org.project.etudiant.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface StudentServices {

    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student getStudentByCIN(Long CIN);
    Student getStudentByFullName(String FullName);
    void deleteStudentByCIN(Long CIN);
    void updateStudentInfo(Student etud);
    double getTauxReussite();

}
