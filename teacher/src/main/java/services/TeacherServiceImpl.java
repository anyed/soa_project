package services;

import entity.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TeacherRepo;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepo teacherRepo;
    @Override
    public List<Enseignant> getAllProfs() {
        return teacherRepo.findAll();
    }

    @Override
    public Enseignant addProf(Enseignant enseignant) {
        return teacherRepo.save(enseignant);
    }

    @Override
    public Enseignant getProfByCIN(Long CIN) {
        return teacherRepo.findEnseignantByCin(CIN);
    }

    @Override
    public Enseignant getProfByFullName(String FullName) {
        return teacherRepo.findEnseignantByFullName(FullName);
    }

    @Override
    public void deleteProfByCIN(Long CIN) {
        teacherRepo.deleteEnseignantByCin(CIN);
    }

    @Override
    public void updateProfInfo(Enseignant prof) {

    }
}
