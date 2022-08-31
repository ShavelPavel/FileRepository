package spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.backend_polyclinic1.backend_polyclinic1.spring_backend_polyclinic.entity.Staff;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StaffDaoImpl implements StaffDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Staff> getAllStaff() {
        Query query=entityManager.createQuery("from staff");
        List<Staff> allPatients=query.getResultList();

        return allPatients;
    }

    @Override
    public void saveStaff(Staff staff) {
        Staff newStaff =entityManager.merge(staff);
        staff.setId(newStaff.getId());

    }

    @Override
    public Staff getStaff(int id) {
        Staff staff =entityManager.find(Staff.class,id);
        return staff;
    }

    @Override
    public void deleteStaff(int id) {
        Query query=entityManager.createQuery(
                "delete from staff where id =:staffId");
        query.setParameter("staffId",id);
        query.executeUpdate();


    }
}
