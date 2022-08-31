package spring.project.spring_backend_polyclinic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.project.spring_backend_polyclinic.entity.Patients;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PatientsDaoImpl implements PatientsDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Patients> getAllPatients() {
        Query query=entityManager.createQuery("from patients");
        List<Patients> allPatients=query.getResultList();

        return allPatients;
    }

    @Override
    public void savePatients(Patients patients) {
        Patients newPatients=entityManager.merge(patients);
        patients.setId(newPatients.getId());

    }

    @Override
    public Patients getPatients(int id) {
        Patients patients=entityManager.find(Patients.class,id);
        return patients;
    }

    @Override
    public void deletePatients(int id) {
        Query query=entityManager.createQuery(
                "delete from patients where id =:patientsId");
        query.setParameter("patientsId",id);
        query.executeUpdate();


    }
}
