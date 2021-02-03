package org.project.administration.services;

import org.project.administration.entity.Adminsitrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface AdministrationService{
    List<Adminsitrator> getAllAdminsitrators();
    Adminsitrator addAdminsitrator(Adminsitrator administrator);
    Adminsitrator getAdminsitratorByCIN(Long CIN);
    Adminsitrator getAdminsitratorByFullName(String FullName);
    void deleteAdminsitratorByCIN(Long CIN);
    void updateAdminsitratorInfo(Adminsitrator admin);
}
