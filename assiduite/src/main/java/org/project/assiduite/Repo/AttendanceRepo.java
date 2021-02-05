package org.project.assiduite.Repo;

import org.project.assiduite.common.Adminsitrator;
import org.project.assiduite.common.Enseignant;
import org.project.assiduite.common.Student;
import org.project.assiduite.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AttendanceRepo extends JpaRepository<Attendance, Long> {
//    @Query(value = "SELECT status,count(available) as total " +
//            "FROM attendancedetail " +
//            "where available=1 and department_id = ?1 and month = ?2 and shift = ?3 group by employee_id " +
//            "order by count(available) desc")
    @Query(value = "select status as StudentAttendance " +
            "From Attendance " +
            "where fullName in (select fullName from Student )")
    Student findStudentAttendance();
//    String findStudentAttendanceByCin(Long cin);
}
