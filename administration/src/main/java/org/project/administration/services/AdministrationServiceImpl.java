package org.project.administration.services;

import org.project.administration.DAO.AdministrationRepo;
import org.project.administration.entity.Adminsitrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministrationServiceImpl implements AdministrationService {
    @Autowired
    AdministrationRepo administrationRepo;
    @Override
    public List<Adminsitrator> getAllAdminsitrators() {
        return administrationRepo.findAll();
    }

    @Override
    public Adminsitrator addAdminsitrator(Adminsitrator administrator) {
        return administrationRepo.save(administrator);
    }

    @Override
    public Adminsitrator getAdminsitratorByCIN(Long CIN) {
        return administrationRepo.findAdminsitratorByCIN(CIN);
    }

    @Override
    public Adminsitrator getAdminsitratorByFullName(String FullName) {
        return administrationRepo.findAdminsitratorByFullName(FullName);
    }

    @Override
    public void deleteAdminsitratorByCIN(Long CIN) {
        administrationRepo.deleteAdminsitratorByCIN(CIN);
    }

    @Override
    public void updateAdminsitratorInfo(Adminsitrator admin) {
        administrationRepo.save(admin);
    }
}
