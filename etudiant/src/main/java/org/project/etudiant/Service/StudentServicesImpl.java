package org.project.etudiant.Service;

import org.project.etudiant.DAO.StudentRepo;
import org.project.etudiant.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServicesImpl implements StudentServices{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentByCIN(Long CIN) {
        return studentRepo.findStudentByCIN(CIN);
    }

    @Override
    public Student getStudentByFullName(String FullName) {
        return studentRepo.findStudentByFullName(FullName);
    }

    @Override
    public void deleteStudentByCIN(Long CIN) {
studentRepo.deleteStudentByCIN(CIN);
    }

    @Override
    public void updateStudentInfo(Student etud) {

    }

    @Override
    public double getTauxReussite() {
        Long successful = studentRepo.countAllByResult("succes");
        double All = studentRepo.count();
        System.out.println("successful : "+successful+" ; All :"+All);
        if (All != 0) {return ((double) successful)/All;}
        else return -1;
    }


}
