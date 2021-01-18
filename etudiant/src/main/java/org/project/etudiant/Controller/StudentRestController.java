package org.project.etudiant.Controller;

import org.project.etudiant.DAO.StudentRepo;
import org.project.etudiant.Service.StudentServices;
import org.project.etudiant.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/addNewStudent")
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        return studentServices.addStudent(student);
    }

    @GetMapping("/getStudentByCIN/{CIN}")
    public Student getStudentByCIN(@PathVariable Long CIN) {
        return studentServices.getStudentByCIN(CIN);
    }

    @GetMapping("/getStudentByFullName/{FullName}")
    public Student getStudentByFullName(@PathVariable String FullName) {
//        Optional<Student> student = studentRepo.findById().findOne().findStudentByFullName(FullName);
//        if (student.isPresent(FullName)){
//            return student.get();
//        }else{
//            throw new RuntimeException("Student not found with the name : "+FullName);
//        }
        return studentServices.getStudentByFullName(FullName);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        System.out.println("in getAllStudents");
        return studentServices.getAllStudents();
    }

    @DeleteMapping("/DeleteStudent/{CIN}")
    public void deleteStudent(@PathVariable Long CIN) {
        studentServices.deleteStudentByCIN(CIN);
    }

    @PutMapping("/updateStudent/{etud}")
    public void updateStudentInfo(@PathVariable Student etud) {
        studentServices.updateStudentInfo(etud);
    }

}
