package org.project.administration.controller;

import org.project.administration.DAO.AdministrationRepo;
import org.project.administration.entity.Adminsitrator;
import org.project.administration.services.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping("/administrator")
public class AdminRestController {

    @Autowired
    private AdministrationService administrationService;
    @Autowired
    private AdministrationRepo administrationRepo ;
    @PostMapping("/addNewAdministrator")
    public Adminsitrator addAdministrator(@RequestBody Adminsitrator adminsitrator) {
        System.out.println(adminsitrator);
        return administrationService.addAdminsitrator(adminsitrator);
    }

    @GetMapping("/getAdministratorByCIN/{CIN}")
    public Adminsitrator getAdministratorByCIN(@PathVariable Long CIN) {
        return administrationService.getAdminsitratorByCIN(CIN);
    }

    @GetMapping("/getAdministratorByFullName/{FullName}")
    public Adminsitrator getAdministratorByFullName(@PathVariable String FullName) {
//        Optional<Student> student = studentRepo.findById().findOne().findStudentByFullName(FullName);
//        if (student.isPresent(FullName)){
//            return student.get();
//        }else{
//            throw new RuntimeException("Student not found with the name : "+FullName);
//        }
        return administrationService.getAdminsitratorByFullName(FullName);
    }

    @GetMapping("/getAllAdministrators")
    public List<Adminsitrator> getAllAdministrators() {
        System.out.println("in getAllAdministrators");
        return administrationService.getAllAdminsitrators();
    }

    @DeleteMapping("/DeleteAdministrator/{CIN}")
    public void deleteAdministrator(@PathVariable Long CIN) {
        administrationService.deleteAdminsitratorByCIN(CIN);
    }

    @PutMapping("/updateAdministrator/{admin}")
    public void updateStudentInfo(@PathVariable Adminsitrator admin) {
        administrationService.updateAdminsitratorInfo(admin);
    }
    @GetMapping("/stats")
    public Map<String, Integer> getStats(){
        Integer nbAdministrators = Math.toIntExact(administrationRepo.count());
        System.out.println("nbAdministrators : "+nbAdministrators);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("nbAdministrators", nbAdministrators);
        return map;
    }

}
