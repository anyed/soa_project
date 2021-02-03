package org.project.etudiant.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long student_id;
    @NotNull
    private long CIN;
    @NotNull
    private String fullName;
    @NotNull
    private String Sexe;
    @NotNull
    private Date Birthday;
    private String Email;
    private String Adress;
    private Long Phone;
    private Date InscriptionDate;
    private String Level;
    private String Degree;
    private String result;
}
