package org.project.administration.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.project.administration.entity.Adminsitrator;
@RepositoryRestController
public interface AdministrationRepo extends JpaRepository<Adminsitrator,Long>{
        void deleteAdminsitratorByCIN(Long CIN);

    Adminsitrator findAdminsitratorByCIN(Long CIN);

    Adminsitrator findAdminsitratorByFullName(String FullName);
    }

