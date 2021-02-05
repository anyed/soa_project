package org.project.assiduite.controller;

import org.project.assiduite.Repo.AttendanceRepo;
import org.project.assiduite.common.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping("/attendance")
public class AssiduiteRestController {
    @Autowired
    private AttendanceRepo attendanceRepo;

//    @GetMapping("/studentAttendance/{cin}")
//    public String getStudentAttendanceByCin(@PathVariable Long cin){
//        return attendanceRepo.findStudentAttendanceByCin(cin);
//    }
@GetMapping("/studentAttendance")
public Student getStudentAttendance(){
    return attendanceRepo.findStudentAttendance();
}
}
