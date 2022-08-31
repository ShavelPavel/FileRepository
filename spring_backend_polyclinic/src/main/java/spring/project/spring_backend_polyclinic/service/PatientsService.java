package spring.project.spring_backend_polyclinic.service;

import spring.project.spring_backend_polyclinic.entity.Patients;

import java.util.List;

public interface PatientsService {
    public List<Patients> getAllPatients();

    public void savePatients(Patients patients);

    public Patients getPatients(int id);

    public void deletePatients(int id);
}
