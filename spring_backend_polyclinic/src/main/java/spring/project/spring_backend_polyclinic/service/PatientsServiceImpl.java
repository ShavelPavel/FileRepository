package spring.project.spring_backend_polyclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.project.spring_backend_polyclinic.dao.PatientsDAO;
import spring.project.spring_backend_polyclinic.entity.Patients;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService {
    @Autowired
    private PatientsDAO patientsDAO;
    @Override
    @Transactional
    public List<Patients> getAllPatients() {
        return patientsDAO.getAllPatients();
    }

    @Override
    @Transactional
    public void savePatients(Patients patients) {
        patientsDAO.savePatients(patients);

    }

    @Override
    @Transactional
    public Patients getPatients(int id) {
        return patientsDAO.getPatients(id);
    }

    @Override
    @Transactional
    public void deletePatients(int id) {
        patientsDAO.deletePatients(id);

    }
}
