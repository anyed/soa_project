package org.project.etudiant.Service;

import org.project.etudiant.DAO.StudentRepo;
import org.project.etudiant.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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


}
