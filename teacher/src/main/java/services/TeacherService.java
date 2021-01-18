package services;

import entity.Enseignant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public interface TeacherService {

        List<Enseignant> getAllProfs();
        Enseignant addProf(Enseignant enseignant);
        Enseignant getProfByCIN(Long CIN);
        Enseignant getProfByFullName(String FullName);
        void deleteProfByCIN(Long CIN);
        void updateProfInfo(Enseignant prof);
}
