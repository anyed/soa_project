package org.project.etudiant.Service;

import org.project.etudiant.DAO.ExamRepo;
import org.project.etudiant.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExamServicesImpl implements ExamServices {

    @Autowired
    ExamRepo examRepo;


    @Override
    public List<Exam> getAllExams() {
        return examRepo.findAll();
    }

    @Override
    public void deleteExamBySubjectAndExamDate(String subject, Date examDate) {
        examRepo.deleteExamBySubjectAndExamDate(subject, examDate);
    }

    @Override
    public void updateExamInfo(Exam exam) {
        examRepo.save(exam);
    }

    @Override
    public Integer getExamResultByCIN(Long CIN, Long examID) {
        return examRepo.findExamByCinStudent(CIN).note;
    }

    @Override
    public Exam addNewExam(Exam exam) {
        return examRepo.save(exam);
    }

}
