package org.project.etudiant.Controller;

import net.minidev.json.JSONObject;
import org.project.etudiant.DAO.ExamRepo;
import org.project.etudiant.DAO.StudentRepo;
import org.project.etudiant.Service.StudentServices;
import org.project.etudiant.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ExamRepo examRepo;

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
    @ResponseBody
    public List<Student> getAllStudents() {
        System.out.println("in get all students");
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

    @GetMapping("/getSuccessRate")
    public double getSuccessRate(){
        return studentServices.getTauxReussite();
    }

    @GetMapping("/stats")
    public Map<String, Integer> getStats(){
        Integer nbStudents = Math.toIntExact(studentRepo.count());
        Integer nbExams = Math.toIntExact(examRepo.count());
        System.out.println("nbStudents : "+nbStudents+" ; nbExams :"+nbExams);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("nbStudents", nbStudents);
        map.put("nbExams", nbExams);
        return map;
    }
}
