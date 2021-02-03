package org.project.etudiant.Service;

import org.project.etudiant.entity.Exam;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public interface ExamServices {
    List<Exam> getAllExams();
    void deleteExamBySubjectAndExamDate(String subject,Date examDate);
    void updateExamInfo(Exam exam);
    Integer getExamResultByCIN(Long CIN, Long examID);
    Exam addNewExam(Exam exam);

}
