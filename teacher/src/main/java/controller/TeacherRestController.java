package controller;

import entity.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import services.TeacherService;

import java.util.List;
@CrossOrigin("*")
@RestController
@RefreshScope
@RequestMapping("/enseignant")
public class TeacherRestController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/addNewEnseignant")
    public Enseignant addEnseignant(@RequestBody Enseignant enseignant) {
        System.out.println(enseignant);
        return teacherService.addProf(enseignant);
    }

    @GetMapping("/getEnseignantByCIN/{CIN}")
    public Enseignant getEnseignantByCIN(@PathVariable Long CIN) {
        return teacherService.getProfByCIN(CIN);
    }

    @GetMapping("/getEnseignantByFullName/{FullName}")
    public Enseignant getEnseignantByFullName(@PathVariable String FullName) {
        return teacherService.getProfByFullName(FullName);
    }

    @GetMapping("/getAllEnseignants")
    public List<Enseignant> getAllEnseignants() {
        System.out.println("in getAllProfs");
        return teacherService.getAllProfs();
    }

    @DeleteMapping("/DeleteProf/{CIN}")
    public void deleteStudent(@PathVariable Long CIN) {
        teacherService.deleteProfByCIN(CIN);
    }

    @PutMapping("/updateProf/{prof}")
    public void updateStudentInfo(@PathVariable Enseignant prof) {
        teacherService.updateProfInfo(prof);
    }
}
