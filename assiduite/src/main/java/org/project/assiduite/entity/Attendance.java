package org.project.assiduite.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long presence_id;
    private String fullName;
    //    @DateTimeFormat("yyyy-mm-dd")
    private String cin;
    private Date dateAndTime;
    private String status;

}
