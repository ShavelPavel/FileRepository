package spring.project.spring_backend_polyclinic.dao;

import spring.project.spring_backend_polyclinic.entity.Patients;

import java.util.List;

public interface PatientsDAO {

    public List<Patients> getAllPatients();

    public void savePatients(Patients patients);

    public Patients getPatients(int id);

    public void deletePatients(int id);
}
