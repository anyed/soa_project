package entity;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Administrateur {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long prof_id;
        @NotNull
        private long cin;
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
