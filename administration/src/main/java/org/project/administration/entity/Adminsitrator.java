package org.project.administration.entity;

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
@Table(name = "Administrators")
public class Adminsitrator {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long prof_id;
        @NotNull
        private long CIN;
        @NotNull
        private String fullName;
        @NotNull
        private String sexe;
        @NotNull
        private Date birthday;
        @NotNull
        private String email;
        @NotNull
        private String adresse;
        @NotNull
        private Long phone;
        @NotNull
        private Date dateEmbauche;
        @NotNull
        private String poste;

    }

