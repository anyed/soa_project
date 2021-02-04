package org.project.teacher.controller;

import org.project.teacher.entity.Enseignant;
import org.project.teacher.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.project.teacher.services.TeacherService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RefreshScope
@RequestMapping("/enseignant")
public class TeacherRestController {
    @Autowired
    public TeacherService teacherService;
    @Autowired
    public TeacherRepo teacherRepo;

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
    @GetMapping("/stats")
    public Map<String, Integer> getStats(){
        Integer nbTeachers = Math.toIntExact(teacherRepo.count());
        System.out.println("nbTeachers : "+nbTeachers);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("nbTeachers", nbTeachers);
        return map;
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
