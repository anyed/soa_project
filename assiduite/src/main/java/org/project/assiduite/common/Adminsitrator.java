package org.project.assiduite.common;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

