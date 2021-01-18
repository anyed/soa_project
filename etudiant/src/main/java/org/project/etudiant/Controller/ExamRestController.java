package org.project.etudiant.Controller;

import lombok.extern.slf4j.Slf4j;
import org.project.etudiant.DAO.ExamRepo;
import org.project.etudiant.Service.ExamServices;
import org.project.etudiant.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RefreshScope
@RestController
@Slf4j
public class ExamRestController {

    @Autowired
    private ExamServices examServices;

    @PostMapping("/students/addExam")
    public void addNewExam(@RequestBody Exam exam){
        System.out.println(exam);
        examServices.addNewExam(exam);
    }

    @GetMapping("/students/getAllExams")
    public List<Exam> getAllExams() {
        return examServices.getAllExams();
    }

    @DeleteMapping("/students/DeleteExam/{subject}/{examDate}")
    public void deleteExamBySubjectAndExamDate(@PathVariable String subject, @PathVariable Date examDate) {
        examServices.deleteExamBySubjectAndExamDate(subject, examDate);
    }

    @PutMapping("/students/updateExam/{exam}")
    public void updateExamInfo(@PathVariable Exam exam) {
        examServices.updateExamInfo(exam);
    }

    @GetMapping("/students/getExamResultStudent/{examID}/{CIN}")
    public Integer getExamResultByCIN(@PathVariable Long CIN,@PathVariable Long examID) {
        return examServices.getExamResultByCIN(CIN,examID);
    }
}
